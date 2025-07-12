class Solution {
    List<List<String>> ans=new ArrayList<>();
    List<String> partitions=new ArrayList<>();
    public List<List<String>> partition(String s) {
        getAllParts(s,partitions,ans);
        return ans;
    }

    public void getAllParts(String s, List<String> partitions, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(partitions));
            return;
        }

        for(int i=0;i<s.length();i++){
            String part=s.substring(0,i+1);
            if(isPalin(part)){
                partitions.add(part);
                getAllParts(s.substring(i+1),partitions,ans);
                partitions.remove(partitions.size() - 1);
            }
        }
    }

    public boolean isPalin(String s){
        String s2=s;
        String reversed="";
        for (int i = s2.length() - 1; i >= 0; i--) {
            reversed = reversed + s2.charAt(i);
        }

        return s.equals(reversed);
    }
}