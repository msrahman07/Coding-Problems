from Progression import Progression

class FibonacciProgression(Progression):

    def __init__(self, first=0, second=1):
        super().__init__(first)
        self._prev = second-first

    def _advance(self):
        self._prev, self._current = self._current, self._current + self._prev


if __name__ == '__main__':
    fib = FibonacciProgression(4,6)
    fib.print_progressions(6)