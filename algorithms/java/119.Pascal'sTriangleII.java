class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i <= rowIndex; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    list.add(1);
                } else if(j == i){
                    list.add(1);
                    list.poll();
                } else {
                    list.add(list.get(0)+list.get(1));
                    list.poll();
                }
            }
        }
        return list;
    }
}