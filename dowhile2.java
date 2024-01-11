import java.util.*;

public class dowhile2 {
    public static void main(String[] args){
        List<String> usersLogged = new ArrayList<>();
        int usersLimit = 2;
        Scanner scnInput = new Scanner(System.in);
        String usuario;
        
        try{
            while (usersLogged.size() < usersLimit){
                if (usersLogged.isEmpty()){
                    System.out.println("Não há usuários conectados no momento.");
                }
                System.out.println("Digite um nome de usuário ou tecle enter para gerar um nome aleatório.");
                usuario = scnInput.nextLine();
                if(usuario != ""){
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("User" + Math.random());
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuários atingido.");
        }catch (Exception e){
            System.out.println("Ops! Ocorreu um erro." + e.getMessage());
        }
        scnInput.close();
        System.out.println(usersLogged.size() + " usuários cadastrados. "+ usersLogged);

    }

    
}
