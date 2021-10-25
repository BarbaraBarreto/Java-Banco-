/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class Dados {
    private int maxusuarios = 50;    
   
private Usuarios Musuarios[] = new Usuarios [maxusuarios];
   
   private int countusuarios = 0;
    private Usuarios[] Musuario;
    
    public Dados(){
        Usuarios Musuario = new Usuarios("admin","admin1","admin2","123","1");
        Musuarios[countusuarios] = Musuario;
        countusuarios ++;
    }
    
    public int Msuarios(){
        return countusuarios;
    }
    
    public Usuarios[] getUsuarios(){
        return Musuario;
    }
    
    public boolean validarUsuario(String usuario,String senha){
       boolean x = false;
       for(int i=0;1 <countusuarios; i++){
           if(Musuarios[i].getCodusuario().equals(usuario)&& Musuarios[i].getSenha().equals(senha)){
               return true;
           }
        }
       return false;
    }
    
     public int LinhaUsuario(String usuario){
         
       for(int i=0;1 <countusuarios; i++){
           if(Musuarios[i].getCodusuario().equals(usuario)){
               return i;
           }
        }
       return -1;
    }
     
     public String CadUsuario(Usuarios Musuario){
         if(countusuarios == maxusuarios){
             return "Você não tem mais espaço no seu banco";
         }
         
         Musuarios[countusuarios] = Musuario;
         countusuarios ++;
         return "Usuário cadastrado com sucesso";
     }
     
     public String EditarUsuario(Usuarios Musuario, int poslinha){
         Musuarios[poslinha].setNome(Musuario.getNome());
         Musuarios[poslinha].setNome(Musuario.getSobrenome());
         Musuarios[poslinha].setNome(Musuario.getSenha());
         return "Usuário editado com sucesso";
     }

}
    

