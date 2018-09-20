/**
* Defina una clase para representar un libro. Incluya atributos para identificar si el libro es digital o impreso, el código de identificación (ISBN), el autor(es), año de publicación, género literario, cantidad de páginas y otros que considere necesarios. Defina la clase dentro del paquete com.telusinternational.books
* Defina un constructor que reciba como parámetros obligatorios el ISBN del libro y el género literario.
*/

package com.telusinternational.books;

public class Book {

       boolean isDigital;
       private String isbn;
       String[] authors;
       int year;
       private String topic;
       int pagesQuantity;

       public Book(String isbn, String topic) {
              this.isbn = isbn;
              this.topic = topic;
       }
       
}

public class User {
       private String password;
       private String nickname;

       public User(String password, String nickname) {
              this.password = password;
              this.nickname = nickname;
       }

       public void setNickname(String nickname) {
              if(nickname.length() >= 5 && nickname.length() <= 20) {
                     this.nickname = nickname;
              }
       }

       public String getNickname() {
              return this.nickname;
       }

       public void changePassword(String oldPassword, String password, String confirmPassword) {
              if(this.password.equals(oldPassword)) {
                     if(password.equals(confirmPassword)) {
                            this.password = password;
                     }
              }
       }

       public String getPassword() {
              return this.password;
       }
}

public class Library {

       public static void main(String[] args) {
              Book barbuchin = new Book("123-123-123", "Infantil");
              User user = new User(args[0], args[1]);
              user.password = "1234";
              System.out.println(barbuchin.isbn);
       }
}

/*
Niveles de acceso
public -> (menos restrictivo) Se puede acceder desde cualquier ubicación (paquete o clase)
default -> () Se pueden acceder solo por los elementos que estén en el mismo paquete se da ausencia de modificador
private -> (más restrictivo) Solo se pueden acceder dentro de la misma clase
protected -> ()
*/