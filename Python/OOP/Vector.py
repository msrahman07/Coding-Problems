class Vector:
    _coordinates = []
    def __init__(self, dimension):
        self._coordinates = [0]*dimension

    def __getitem__(self, index):
        return self._coordinates[index]
    def __setitem__(self, index, value):
        self._coordinates[index] = value
    
    def __add__(self, other):
        if(len(self) != len(other)):
            raise ValueError("dimension must agree")

        new_vector = Vector(len(self))
        
        for i in range(len(self)):
            new_vector[i] = self._coordinates[i] + other[i]
        
        return new_vector
    
    def __len__(self):
        return len(self._coordinates)

    def __str__(self) -> str:
        return '<' + str(self._coordinates)[1:-1] + '>'
    
    def __eq__(self, other):
        return self._coordinates == other._coordinates

    def __ne__(self, other):
        return not self == other

if __name__ == "__main__":
    v = Vector(5)
    v[0] = 24
    v[-1] = 90
    u = v + v
    print(u)