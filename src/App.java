public class App {
    public static void main(String[] args){
        
        Livros livro1 = new Livros();
        
        livro1.nome = "Naruto";
        livro1.quantidade = 3;
        livro1.genero = "Mangá";
        livro1.autor = "Masashi Kishimoto";

        Livros livro2 = new Livros();
        
        livro2.nome = "O Hospital Hostil";
        livro2.quantidade = 1;
        livro2.genero = "Terror";
        livro2.autor = "Lemony Snicket";

        Livros livro3 = new Livros();

        livro3.nome = "O quinze";
        livro3.quantidade = 1;
        livro3.genero = "Ficção";
        livro3.autor = "Rachel de Queiroz";

        Livros livro4 = new Livros();

        livro4.nome = "As fatias do mundo";
        livro4.quantidade = 1;
        livro4.genero = "Juvenil";
        livro4.autor = "Nilma Gonçalves Lacerda";

        Livros livro5 = new Livros();

        livro5.nome = "Arsene lupin";
        livro5.quantidade = 1;
        livro5.genero = "Mistério";
        livro5.autor = "Maurice Leblac";

        Livros livro6 = new Livros();

        livro6.nome = "Assasin's Creed Renascença";
        livro6.quantidade = 1;
        livro6.genero = "Luta";
        livro6.autor = "Oliver Bowden";

        Livros livro7 = new Livros();

        livro7.nome = "Arlequina";
        livro7.quantidade = 1;
        livro7.genero = "Quadrinhos";
        livro7.autor = "Paul Dine e Bruce Timm";

        System.out.format("Livro 1 %s criado por %s com o genero %s e a quantidade de %d\n", livro1.nome, livro1.autor, livro1.genero, livro1.quantidade);
        System.out.format("Livro 2 %s criado por %s com o genero %s e a quantidade de %d\n", livro2.nome, livro2.autor, livro2.genero, livro2.quantidade);
        System.out.format("Livro 3 %s criado por %s com o genero %s e a quantidade de %d\n", livro3.nome, livro3.autor, livro3.genero, livro3.quantidade);
        System.out.format("Livro 4 %s criado por %s com o genero %s e a quantidade de %d\n", livro4.nome, livro4.autor, livro4.genero, livro4.quantidade);
        System.out.format("Livro 5 %s criado por %s com o genero %s e a quantidade de %d\n", livro5.nome, livro5.autor, livro5.genero, livro5.quantidade);
        System.out.format("Livro 6 %s criado por %s com o genero %s e a quantidade de %d\n", livro6.nome, livro6.autor, livro6.genero, livro6.quantidade);
        System.out.format("Livro 7 %s criado por %s com o genero %s e a quantidade de %d\n", livro7.nome, livro7.autor, livro7.genero, livro7.quantidade);

    }
}
