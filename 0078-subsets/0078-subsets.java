class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new Stack<>());
        return ans;
    }
    public void solve(int arr[], int i, Stack<Integer> st){
        if(i==arr.length){
            ans.add(new ArrayList<>(st));
            return;
        }
        st.push(arr[i]);
        solve(arr,i+1,st);
        st.pop();
        solve(arr,i+1,st);
    }
}