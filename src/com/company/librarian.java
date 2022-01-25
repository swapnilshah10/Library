package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class librarian {

    public static void library_options(){
        Frame lib_f1 = new Frame("Librarian");

        Button book_new = new Button("Add new Book");
        book_new.setBounds(250,50,100,40);

        Button book_available = new Button("Available Books");
        book_available.setBounds(250,110,100,40);

        Button book_issued = new Button("Issued Books");
        book_issued.setBounds(250,170,100,40);

        Button book_issue = new Button("Issue Book");
        book_issue.setBounds(250,230,100,40);

        Button list_defaulter = new Button("Defaulter's List");
        list_defaulter.setBounds(250,290,100,40);

        Button logout = new Button("Logout");
        logout.setBounds(250,350,100,40);

        book_issue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                issue_form.form();
            }
        });

        lib_f1.add(book_new);
        lib_f1.add(book_available);
        lib_f1.add(book_issued);
        lib_f1.add(book_issue);
        lib_f1.add(list_defaulter);
        lib_f1.add(logout);

        lib_f1.setSize(600,450);
        lib_f1.setLayout(null);
        lib_f1.setVisible(true);
        lib_f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                lib_f1.dispose();
            }
        });
    }

}
