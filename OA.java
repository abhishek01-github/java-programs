class person{
    public person(String newname){
        name = newname;
    }
    private String name;
    public String tellname(){
        return name;
    }
}
class OA{
    public static void main(String[] args) {
        person abhi = new person("Abhi");
        System.out.println("hello" + abhi.tellname());
    }
}