class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(numRows);
        if(numRows == 1){
            triangle.add(new ArrayList<Integer>(
            List.of((1))));
            return triangle;
        }
        else if(numRows == 2){
            triangle.add(new ArrayList<Integer>(List.of(1)));
            triangle.add(new ArrayList<Integer>(List.of(1,1)));
            
            return triangle;
        }
        else{
            triangle.add(new ArrayList<Integer>(List.of(1)));
            triangle.add(new ArrayList<Integer>(List.of(1,1)));
            for(int i=2;i<numRows;i++){
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(1);
                for(int j=1; j<i; j++){
                    newList.add(triangle.get(i-1).get(j) + triangle.get(i-1).get(j-1));
                }
                newList.add(1);
                triangle.add(newList);
            }
            return triangle;          
        }
    }
}
