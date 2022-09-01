using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace TwoDecksWPF
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private Deck deckOne = new Deck();
        private List<Card> deckTwo;

        public MainWindow()
        {
            InitializeComponent();
            deck1List.ItemsSource = deckOne.Cards;

        }

        private void ShuffleButton_Click(object sender, RoutedEventArgs e)
        {
            deckOne.Shuffle();
            deck1List.ItemsSource = new List<Card>();
            deck1List.ItemsSource = deckOne.Cards;
        }

        private void ResetButton_Click(object sender, RoutedEventArgs e)
        {
            deckOne.Sort();
            deck1List.ItemsSource = new List<Card>();
            deck1List.ItemsSource = deckOne.Cards;
        }

        private void ClickedOnDeck1(object sender, MouseButtonEventArgs e)
        {
            deck2List.Items.Add(sender as Card);
        }

        private void ListItem_MouseDown(object sender, MouseButtonEventArgs e)
        {
            deck2List.Items.Add(sender as Card);
        }
    }
}
