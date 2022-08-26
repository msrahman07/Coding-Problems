using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPExperiments
{
    internal class SecretAgent
    {
        private string realName = "Shahriar";
        private string password = "code";
        public string Alias = "Sherry";

        public void AgentGreeting(string pass)
        {
            if(pass == this.password)
            {
                Console.WriteLine(realName);
            }
            else
            {
                Console.WriteLine(Alias);
            }
        }

    }
}
