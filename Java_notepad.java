
package awt;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class Java_notepad extends JFrame {

    JTextArea ma;
    JMenuBar mbar;
    JMenu mFile, mEdit, mFormat, mHelp;
    JMenuItem iNew, iOpen, iSave, iSaveas, iExit, iCopy, iCut, iPaste, iColor;
    JCheckBoxMenuItem wordWrap;
    String fn,fc;
    JFileChooser jc;

    private void run() {
        jc = new JFileChooser(".");
        ma = new JTextArea();
        getContentPane().add(ma);
        getContentPane().add(new JScrollPane(ma), BorderLayout.CENTER);
        setTitle("Notepad");
        setSize(600, 600);

        mbar = new JMenuBar();

        mFile = new JMenu("File");
        mEdit = new JMenu("Edit");
        mFormat = new JMenu("Format");
        mHelp = new JMenu("Help");

        iNew = new JMenuItem("New");
        iOpen = new JMenuItem("Open");
        iSave = new JMenuItem("Save");
        iSaveas = new JMenuItem("Save as");
        iExit = new JMenuItem("Exit");
        iCopy = new JMenuItem("Copy"); 
        iCut = new JMenuItem("Cut");
        iPaste = new JMenuItem("Paste");
        iColor = new JMenuItem("Front colour");
        wordWrap = new JCheckBoxMenuItem("wordWrap");

        iNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        iOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        iSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        iCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        iCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        iPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        mFile.add(iNew);
        mFile.add(iOpen);
        mFile.add(iSave);
        mFile.add(iSaveas);
        mFile.addSeparator();
        mFile.add(iExit);

        mEdit.add(iCopy);
        mEdit.add(iCut);
        mEdit.add(iPaste);

        mFormat.add(wordWrap);
        mFormat.add(iColor);

        mbar.add(mFile);
        mbar.add(mEdit);
        mbar.add(mFormat);
        mbar.add(mHelp);

        setJMenuBar(mbar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
     private void clear() {
        ma.setText(null);
        setTitle("Untitled Notepad");
        fn = null;
        fc = null;
    }

    private void save() {
        PrintWriter n = null;

        try {
            if (fn == null) {
                saveAs();
            } else {
                n = new PrintWriter(new FileWriter(fn));
                String s = ma.getText();
                StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
                while (st.hasMoreElements()) {
                    n.println(st.nextToken());
                }

                JOptionPane.showMessageDialog(rootPane, "File saved");
                fc = ma.getText();
            }

        } catch (IOException e) {

        } finally {
            if (n != null) {
                n.close();
            }
        }

    }
  
    private void saveAs() {
        PrintWriter n = null;
        int rv = -1;
        try {
            rv = jc.showSaveDialog(this);
            if (rv == JFileChooser.APPROVE_OPTION) {
                n = new PrintWriter(new FileWriter(jc.getSelectedFile()));
            }

            String s = ma.getText();
            StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
            while (st.hasMoreElements()) {
                n.println(st.nextToken());
            }

            JOptionPane.showMessageDialog(rootPane, "File saved");
            fc = ma.getText();
            fn = jc.getSelectedFile().getName();
            setTitle(fn = jc.getSelectedFile().getName());

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            n.close();
        }

    }

    private void open() {
        try {
            int rv = jc.showOpenDialog(this);
            if (rv == JFileChooser.APPROVE_OPTION) {
                ma.setText(null);
                Reader i = new FileReader(jc.getSelectedFile());
                char[] buff = new char[10000];
                int ch;
                while ((ch = i.read(buff, 0, buff.length)) != -1) {
                    ma.append(new String(buff, 0, ch));

                }
            }
            fn = jc.getSelectedFile().getName();
            setTitle(fn = jc.getSelectedFile().getName());

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private void open_new() {
        if (!ma.getText().equals("") && !ma.getText().equals(fc)) {
            if (fn == null) {
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to save?");
                if (option == 0) {
                    saveAs();
                    clear();

                } else if (option == 2) {

                } else {
                    clear();
                }
            } else {
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to save?");
                if (option == 0) {
                    save();
                    clear();

                } else if (option == 2) {

                } else {
                    clear();
                }

            }
        } else {
            clear();
        }
    }
    
     public Java_notepad() {
        run();
        iSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }

        });

        iSaveas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs();
            }

        });

        iOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }

        });

        iNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open_new();
            }

        });
        iExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        iCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ma.copy();
            }

        });

        iCut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ma.cut();
            }

        });

        iPaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ma.paste();
            }

        });

        //mainarea.setWrapStyleWord(true);
        wordWrap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wordWrap.isSelected()) {
                    ma.setLineWrap(true);
                    ma.setWrapStyleWord(true);
                } else {
                    ma.setLineWrap(false);
                    ma.setWrapStyleWord(false);
                }
            }

        });
        iColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(rootPane, "choose front color", Color.BLUE);
                ma.setForeground(c);
            }

        });

    }


    public static void main(String[] args) {

        Java_notepad np = new Java_notepad();

    }
}
