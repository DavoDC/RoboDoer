package typer;

import common.BaseGUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * RoboTyper GUI
 *
 * @author David
 */
public class tGUI extends BaseGUI {

    // Program info
    public static final String NAME = "RoboTyper";
    public static final double VERSION = 1.2;

    // Main objects
    public static tGUI gui;
    public static Code code;

    /**
     * Start
     */
    public static void start() {

        // Set look and feel
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.print(e.toString());
            System.exit(1);
        }

        // Create GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                // Initialize GUI and tools
                gui = new tGUI();
                code = new Code();

                // Get screen info
                Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                int SCREEN_W = (int) screen.getWidth();

                // Make adjustments to frame
                gui.setVisible(true);
                gui.setTitle(NAME + " V" + VERSION + " - by David C, 2019");
                int frameXPos = (SCREEN_W / 2) - (gui.getWidth() / 2);
                gui.setLocation(frameXPos, 1);
                gui.setResizable(false);
                gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
                gui.setAlwaysOnTop(true);
            }
        });
    }

    /**
     * Creates GUI
     */
    public tGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JMenuBar jMenuBar2 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
        javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        javax.swing.JLabel title = new javax.swing.JLabel();
        javax.swing.JButton startBut = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        javax.swing.JLabel keyLabel = new javax.swing.JLabel();
        javax.swing.JLabel msgLabel = new javax.swing.JLabel();
        javax.swing.JTextField loMin = new javax.swing.JTextField();
        javax.swing.JTextField hiSec = new javax.swing.JTextField();
        javax.swing.JLabel outLabel = new javax.swing.JLabel();
        javax.swing.JCheckBox enterCheck = new javax.swing.JCheckBox();
        javax.swing.JLabel upperLabel = new javax.swing.JLabel();
        javax.swing.JTextField loSec = new javax.swing.JTextField();
        javax.swing.JTextField hiMin = new javax.swing.JTextField();
        javax.swing.JLabel min1 = new javax.swing.JLabel();
        javax.swing.JLabel lowLabel = new javax.swing.JLabel();
        javax.swing.JLabel sec2 = new javax.swing.JLabel();
        javax.swing.JLabel min2 = new javax.swing.JLabel();
        javax.swing.JLabel sec1 = new javax.swing.JLabel();
        javax.swing.JLabel boundsTitle = new javax.swing.JLabel();
        javax.swing.JTextField keyDelay = new javax.swing.JTextField();
        javax.swing.JLabel msLabel = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(820, 579));

        panel.setBackground(new java.awt.Color(255, 182, 81));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(810, 575));

        title.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("RoboTyper ");
        title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        title.setName("title"); // NOI18N

        startBut.setBackground(new java.awt.Color(102, 255, 102));
        startBut.setFont(new java.awt.Font("Dubai", 3, 28)); // NOI18N
        startBut.setForeground(new java.awt.Color(0, 0, 0));
        startBut.setText("Start ");
        startBut.setToolTipText("Start/stop messaging");
        startBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startBut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startBut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startBut.setMargin(new java.awt.Insets(2, 2, 2, 2));
        startBut.setName("startBut"); // NOI18N
        startBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButAction(evt);
            }
        });

        msgArea.setBackground(new java.awt.Color(255, 255, 255));
        msgArea.setColumns(20);
        msgArea.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        msgArea.setForeground(new java.awt.Color(0, 0, 0));
        msgArea.setRows(5);
        msgArea.setText(":peace:, :Wario:, :star2:, :alien:, :TrapCard:, :angel:, :bear:, :bulb:, :superhero:, :infinity:, \nNext MEE6 level here I come, yeet, Youniverse, \nThere is no problem outside of you that is superior to the power within,");
        msgArea.setToolTipText("Comma Separated Messages");
        msgArea.setWrapStyleWord(true);
        msgArea.setName("msgArea"); // NOI18N
        jScrollPane1.setViewportView(msgArea);

        keyLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        keyLabel.setForeground(new java.awt.Color(0, 0, 0));
        keyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keyLabel.setText("Key Delay");
        keyLabel.setToolTipText("The delay between key presses");
        keyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        keyLabel.setName("keyLabel"); // NOI18N

        msgLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(0, 0, 0));
        msgLabel.setText("Messages");
        msgLabel.setToolTipText("One of these messages will be randomly chosen each time");
        msgLabel.setName("msgLabel"); // NOI18N

        loMin.setBackground(new java.awt.Color(255, 255, 255));
        loMin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loMin.setForeground(new java.awt.Color(0, 0, 0));
        loMin.setText("0");
        loMin.setToolTipText("Minutes");
        loMin.setName("loMin"); // NOI18N

        hiSec.setBackground(new java.awt.Color(255, 255, 255));
        hiSec.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        hiSec.setForeground(new java.awt.Color(0, 0, 0));
        hiSec.setText("55");
        hiSec.setToolTipText("Seconds");
        hiSec.setName("hiSec"); // NOI18N

        outLabel.setBackground(new java.awt.Color(255, 255, 255));
        outLabel.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        outLabel.setForeground(new java.awt.Color(0, 0, 0));
        outLabel.setText("Output: ");
        outLabel.setToolTipText("Message Statistics");
        outLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        outLabel.setName("outLabel"); // NOI18N

        enterCheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        enterCheck.setForeground(new java.awt.Color(0, 0, 0));
        enterCheck.setSelected(true);
        enterCheck.setText("Press Enter After Each Message");
        enterCheck.setName("enterCheck"); // NOI18N

        upperLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upperLabel.setForeground(new java.awt.Color(0, 0, 0));
        upperLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upperLabel.setText("Upper");
        upperLabel.setToolTipText("Upper Bound");
        upperLabel.setName("upperLabel"); // NOI18N

        loSec.setBackground(new java.awt.Color(255, 255, 255));
        loSec.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loSec.setForeground(new java.awt.Color(0, 0, 0));
        loSec.setText("45");
        loSec.setToolTipText("Seconds");
        loSec.setName("loSec"); // NOI18N

        hiMin.setBackground(new java.awt.Color(255, 255, 255));
        hiMin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        hiMin.setForeground(new java.awt.Color(0, 0, 0));
        hiMin.setText("0");
        hiMin.setToolTipText("Minutes");
        hiMin.setName("hiMin"); // NOI18N

        min1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min1.setForeground(new java.awt.Color(0, 0, 0));
        min1.setText("m");
        min1.setToolTipText("");
        min1.setName("min1"); // NOI18N

        lowLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lowLabel.setForeground(new java.awt.Color(0, 0, 0));
        lowLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lowLabel.setText("Lower");
        lowLabel.setToolTipText("Lower Bound");
        lowLabel.setName("lowLabel"); // NOI18N

        sec2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sec2.setForeground(new java.awt.Color(0, 0, 0));
        sec2.setText("s");
        sec2.setToolTipText("");
        sec2.setName("sec2"); // NOI18N

        min2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min2.setForeground(new java.awt.Color(0, 0, 0));
        min2.setText("m");
        min2.setToolTipText("");
        min2.setName("min2"); // NOI18N

        sec1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sec1.setForeground(new java.awt.Color(0, 0, 0));
        sec1.setText("s");
        sec1.setToolTipText("");
        sec1.setName("sec1"); // NOI18N

        boundsTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boundsTitle.setForeground(new java.awt.Color(0, 0, 0));
        boundsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boundsTitle.setText("Message Delay Bounds");
        boundsTitle.setToolTipText("A random delay time is calculated for each message using these bounds");
        boundsTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boundsTitle.setName("boundsTitle"); // NOI18N

        keyDelay.setBackground(new java.awt.Color(255, 255, 255));
        keyDelay.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        keyDelay.setForeground(new java.awt.Color(0, 0, 0));
        keyDelay.setText("36");
        keyDelay.setToolTipText("Milliseconds");
        keyDelay.setName("keyDelay"); // NOI18N

        msLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        msLabel.setForeground(new java.awt.Color(0, 0, 0));
        msLabel.setText("milliseconds");
        msLabel.setToolTipText("");
        msLabel.setName("msLabel"); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(startBut, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(305, 305, 305)
                                    .addComponent(keyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(enterCheck))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(loMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(min1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(loSec, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sec1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(hiMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(min2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(hiSec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sec2))
                                                .addComponent(upperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(boundsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39)
                                    .addComponent(keyDelay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(msLabel))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(msgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(boundsTitle)
                                .addGap(0, 0, 0)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(upperLabel)
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(lowLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(keyLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loSec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sec1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hiMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hiSec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sec2)
                            .addComponent(keyDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(enterCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(startBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(null);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * When start button is pressed, process user input
     *
     * @param evt
     */
    private void startButAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButAction

        // Get button
        JButton but = ((JButton) evt.getSource());

        // If start wanted
        if (but.getText().contains("Start")) {

            // Process input
            if (code.processInput(msgArea)) {

                // If successful, set new text and color
                but.setText("Stop ");
                but.setBackground(RED);
            }

        } else {
            // Else if stop wanted
            // Stop typer
            code.stopTyper();

            // Set old text and color
            but.setText("Start ");
            but.setBackground(GREEN);
        }
    }//GEN-LAST:event_startButAction

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea msgArea;
    // End of variables declaration//GEN-END:variables
}
