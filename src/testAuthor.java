import classes.Author;
public class testAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Kate","save@space.com",'F');
        System.out.println(a1);
        a1.setEmail("make@better.com");
        System.out.println("email is "+a1.getEmail());
        System.out.println("gender is "+a1.getGender());
        System.out.println("name is "+a1.getName());

    }
}
