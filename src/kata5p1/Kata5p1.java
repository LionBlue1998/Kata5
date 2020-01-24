package kata5p1;

import java.util.List;

public class Kata5p1 {

    public static void main(String[] args) {
       SelectApp app = new SelectApp();
       app.SelectAll();
       CreateTable.createNewTable();
       String path = "C:\\Users\\Luis Ruiz\\Documents\\NetBeansProjects\\katta5P1\\email.txt";
       List<String> validMails = MailListReader.read(path);
       //insertaListaTabla.insertList(validMails);
    }
    
    
}
