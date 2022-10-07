package exerciseJava;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type, category, description;
        System.out.println("Informe o tipo do animal");
        System.out.println("1- Vertebrado\n2- Invertebrado");
        type = input.nextLine();
        if(("vertebrado".equalsIgnoreCase(type))){
            System.out.println("Informe a categoria do animal:");
            System.out.println("1- Ave\n2- Mamifero");
            category = input.nextLine();
            if("mamífero".equalsIgnoreCase(category)||"mamifero".equalsIgnoreCase(category)){
                System.out.println("Informe a característica do animal:");
                System.out.println("1- Herbívoro\n2- Onívoro");
                description = input.nextLine();
                    if("herbívoro".equalsIgnoreCase(description)||"herbivoro".equalsIgnoreCase(description)){
                        System.out.println("Vaca");
                    }else if("onívoro".equalsIgnoreCase(description)||"onivoro".equalsIgnoreCase(description)){
                        System.out.println("Homem");
                    }else{
                        System.out.println("O valor digitado é inválido");
                    }
            }else{
                System.out.println("Informe a característica do animal:");
                System.out.println("1- Carnívoro\n2- Onívoro");
                description = input.nextLine();
                    if("carnívoro".equalsIgnoreCase(description)||"carnivoro".equalsIgnoreCase(description)){
                        System.out.println("Águia");
                    }else if("onívoro".equalsIgnoreCase(description)||"onivoro".equalsIgnoreCase(description)){
                        System.out.println("Pomba");
                    }else{
                        System.out.println("O valor digitado é inválido");
                    }

            }

        }else if("invertebrado".equalsIgnoreCase(type)){
            System.out.println("Informe a categoria do animal:");
            System.out.println("1- Anelídeo\n2- Inseto");
            category = input.nextLine();
            if("anelídeo".equalsIgnoreCase(category)||"anelideo".equalsIgnoreCase(category)){
                System.out.println("Informe a característica do animal:");
                System.out.println("1- Hematofago\n2- Onívoro");
                description = input.nextLine();
                    if("hematofago".equalsIgnoreCase(description)){
                        System.out.println("Sanguessuga");
                    }else if("onívoro".equalsIgnoreCase(description)||"onivoro".equalsIgnoreCase(description)){
                        System.out.println("Minhoca");
                    }else{
                        System.out.println("O valor digitado é inválido");
                    }
            }else{
                System.out.println("Informe a característica do animal:");
                System.out.println("1- Hematofago\n2- Herbívoro");
                description = input.nextLine();
                    if("hematofago".equalsIgnoreCase(description)){
                        System.out.println("Pulga");
                    }else if("herbívoro".equalsIgnoreCase(description)||"herbivoro".equalsIgnoreCase(description)){
                        System.out.println("Lagarta");
                    }else{
                        System.out.println("O valor digitado é inválido");
                    }

            }

        }

        input.close();
    }
    
}
