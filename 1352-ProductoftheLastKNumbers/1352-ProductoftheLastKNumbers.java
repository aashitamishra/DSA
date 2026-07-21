// Last updated: 7/21/2026, 10:18:14 AM
1class ProductOfNumbers {
2    ArrayList<Integer> list;
3
4
5    public ProductOfNumbers() {
6        list =  new ArrayList<>();     
7    }
8    
9    public void add(int num) {
10        list.add(num);
11        
12    }
13    
14    public int getProduct(int k) {
15        int product = 1;
16        for(  int i = list.size() - 1; i >= list.size() - k; i--){
17           product = product* list.get(i);
18        }
19        return product;
20        
21    }
22}
23
24/**
25 * Your ProductOfNumbers object will be instantiated and called as such:
26 * ProductOfNumbers obj = new ProductOfNumbers();
27 * obj.add(num);
28 * int param_2 = obj.getProduct(k);
29 */