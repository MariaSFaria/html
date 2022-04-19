public class main4 {
    String idiomas;

    main4 (String falado){
        idiomas = falado;
        System.out.println(idiomas + "É falado no mundo")
    }

    public static void main4(String[] args){
        main4 obj1 = new main4("Alemão");
        main4 obj2 = new main4("Inglês");
        main4 obj3 = new main4("Português");
        System.out.println(obj1.idiomas);
    }
}
