class StringB{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Java is easy.Easy is Jubin");
        String find="easy";
        String rep="difficult";
        int index=sb.indexOf(find);

        sb.replace(index,index+find.length(),"difficult");
        index=sb.indexOf(find,rep.length());
        System.out.println(sb);
        
    }
}