import math
class Range:

    def __init__(self, start, end, step=1):
        self._start = start
        self._end = end
        self._step = step
        self._length = max(0, (end - start + step - 1) // step)

    def __len__(self):
        return self._length

    def __getitem__(self, index):
        if(index < 0):
            index += len(self)
        if not 0<=index<self._length:
            raise IndexError("Index out of range")

        return self._start + (index * self._step)

    def __str__(self):
        if(self._step == 1):
            return 'Range('+self._start+','+self._end+')'
        else:
            return 'Range('+self._start+','+self._end+','+self._step+')'
        

if __name__ == '__main__':
    r = Range(200,100000, 3000)
    test = range(200,100000, 3000)
    for i,j in zip(r, test):
        if(i == j):
            print("passed")
