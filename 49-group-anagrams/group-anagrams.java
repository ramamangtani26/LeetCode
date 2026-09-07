class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(String s:strs){
            
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        list.addAll(map.values());
        return list;
    }
}