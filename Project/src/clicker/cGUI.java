package clicker;

import common.BaseGUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * RoboClicker GUI
 *
 * @author David
 */
public class cGUI extends BaseGUI {

    // Program info
    public static final String NAME = "RoboClicker";
    public static final double VERSION = 1.7;

    // Main objects
    public static cGUI gui;
    private static Code code;

    /**
     * Start clicker
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
            @Override
            public void run() {

                // Initialize GUI and tools
                gui = new cGUI();
                code = new Code();

                // Get screen info
                Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                int SCREEN_W = (int) screen.getWidth();
                int SCREEN_H = (int) screen.getHeight();

                // Make adjustments to frame
                gui.setVisible(true);
                gui.setTitle(NAME + " V" + VERSION + " - by David C, 2019");
                int frameXPos = (SCREEN_W / 2) - (gui.getWidth() / 2);
                gui.setLocation(frameXPos, 39);
                gui.setResizable(false);
                gui.setDefaultCloseOperation(EXIT_ON_CLOSE);

                // Add version to title
                JLabel title = (JLabel) gui.getComponentByName("title");
                title.setText(NAME);

                // Update maximums
                gui.setNumFieldVal("maxX", "" + SCREEN_W);
                gui.setNumFieldVal("maxY", "" + SCREEN_H);
            }
        });
    }

    /**
     * Creates GUI
     */
    public cGUI() {
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
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextPane info = new javax.swing.JTextPane();
        javax.swing.JLabel title2 = new javax.swing.JLabel();
        javax.swing.JLabel title4 = new javax.swing.JLabel();
        javax.swing.JButton startButton = new javax.swing.JButton();
        javax.swing.JLabel title5 = new javax.swing.JLabel();
        javax.swing.JLabel title6 = new javax.swing.JLabel();
        javax.swing.JLabel title7 = new javax.swing.JLabel();
        javax.swing.JLabel title8 = new javax.swing.JLabel();
        javax.swing.JLabel title10 = new javax.swing.JLabel();
        javax.swing.JLabel title11 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> mouseSelect = new javax.swing.JComboBox<>();
        javax.swing.JTextField loY = new javax.swing.JTextField();
        javax.swing.JTextField hiX = new javax.swing.JTextField();
        javax.swing.JTextField hiY = new javax.swing.JTextField();
        javax.swing.JTextField loX = new javax.swing.JTextField();
        javax.swing.JTextField hiTime = new javax.swing.JTextField();
        javax.swing.JTextField loTime = new javax.swing.JTextField();
        javax.swing.JLabel title12 = new javax.swing.JLabel();
        javax.swing.JTextField maxY = new javax.swing.JTextField();
        javax.swing.JLabel title13 = new javax.swing.JLabel();
        javax.swing.JTextField maxX = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
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

        info.setEditable(false);
        info.setBackground(new java.awt.Color(255, 248, 73));
        info.setBorder(null);
        info.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 0));
        info.setText("This program can click a mouse button at random locations at random intervals.\nShown on the left are parameters that can be changed.\nA random number generator decides the values of these within the bounds you specify.\nWhen you have entered your desired values, press the bottom button.");
        info.setCaretColor(new java.awt.Color(255, 248, 73));
        info.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        info.setDisabledTextColor(new java.awt.Color(255, 248, 73));
        info.setFocusable(false);
        info.setSelectedTextColor(new java.awt.Color(255, 248, 73));
        info.setSelectionColor(new java.awt.Color(255, 248, 73));
        jScrollPane1.setViewportView(info);

        title2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setName("title"); // NOI18N

        title4.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("X");

        startButton.setBackground(new java.awt.Color(102, 255, 102));
        startButton.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(0, 0, 0));
        startButton.setText("Start ");
        startButton.setToolTipText("");
        startButton.setBorder(null);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startButton.setName("startBut"); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonAction(evt);
            }
        });

        title5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("Y");

        title6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title6.setText("Mouse Button");

        title7.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        title7.setForeground(new java.awt.Color(0, 0, 0));
        title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title7.setText("Time Interval (ms)");

        title8.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        title8.setForeground(new java.awt.Color(0, 0, 0));
        title8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title8.setText("Coordinates");

        title10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        title10.setForeground(new java.awt.Color(0, 0, 0));
        title10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title10.setText("Bounds");

        title11.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title11.setText("Lower");

        mouseSelect.setBackground(new java.awt.Color(242, 250, 137));
        mouseSelect.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        mouseSelect.setForeground(new java.awt.Color(0, 0, 0));
        mouseSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left", "Middle", "Right", " " }));
        mouseSelect.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        mouseSelect.setName("mouseSelect"); // NOI18N

        loY.setBackground(new java.awt.Color(242, 250, 137));
        loY.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loY.setForeground(new java.awt.Color(0, 0, 0));
        loY.setText("200");
        loY.setName("loY"); // NOI18N

        hiX.setBackground(new java.awt.Color(242, 250, 137));
        hiX.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        hiX.setForeground(new java.awt.Color(0, 0, 0));
        hiX.setText("400");
        hiX.setName("hiX"); // NOI18N

        hiY.setBackground(new java.awt.Color(242, 250, 137));
        hiY.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        hiY.setForeground(new java.awt.Color(0, 0, 0));
        hiY.setText("400");
        hiY.setName("hiY"); // NOI18N

        loX.setBackground(new java.awt.Color(242, 250, 137));
        loX.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loX.setForeground(new java.awt.Color(0, 0, 0));
        loX.setText("200");
        loX.setName("loX"); // NOI18N

        hiTime.setBackground(new java.awt.Color(242, 250, 137));
        hiTime.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        hiTime.setForeground(new java.awt.Color(0, 0, 0));
        hiTime.setText("2000");
        hiTime.setName("hiTime"); // NOI18N

        loTime.setBackground(new java.awt.Color(242, 250, 137));
        loTime.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loTime.setForeground(new java.awt.Color(0, 0, 0));
        loTime.setText("1000");
        loTime.setName("loTime"); // NOI18N

        title12.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        title12.setForeground(new java.awt.Color(0, 0, 0));
        title12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title12.setText("Higher");

        maxY.setEditable(false);
        maxY.setBackground(new java.awt.Color(153, 255, 255));
        maxY.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        maxY.setForeground(new java.awt.Color(0, 0, 255));
        maxY.setText("0");
        maxY.setCaretColor(new java.awt.Color(153, 255, 255));
        maxY.setFocusable(false);
        maxY.setName("maxY"); // NOI18N

        title13.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        title13.setForeground(new java.awt.Color(0, 0, 0));
        title13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title13.setText("Max for Upper");

        maxX.setEditable(false);
        maxX.setBackground(new java.awt.Color(153, 255, 255));
        maxX.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        maxX.setForeground(new java.awt.Color(0, 0, 255));
        maxX.setText("0");
        maxX.setCaretColor(new java.awt.Color(153, 255, 255));
        maxX.setFocusable(false);
        maxX.setName("maxX"); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftExit(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRightExit(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("X");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLeftExit(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightExit(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(title11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(title10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(title12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mouseSelect, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(loY, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loX, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loTime, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(hiTime, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hiY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hiX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(41, 41, 41)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxY, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxX, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hiTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mouseSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(title11)
                                    .addComponent(title13)
                                    .addComponent(title12))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(title10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hiX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loX, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(title5))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hiY, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(loY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(maxX, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxY)))
                        .addGap(116, 116, 116)))
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(57, 57, 57))
        );

        jMenuBar1.setBorder(null);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The action attached to the Start Clicking button
     *
     * @param evt
     */
    private void startButtonAction(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startButtonAction
    {//GEN-HEADEREND:event_startButtonAction
        // Get button
        JButton but = ((JButton) evt.getSource());

        // If start wanted
        if (but.getText().contains("Start")) {

            // Process input
            if (code.processInput()) {

                // If successful, set new text and color
                but.setText("Stop ");
                but.setBackground(RED);
            }

        } else {
            // Else if stop wanted
            // Stop typer
            code.stopClicker();

            // Set old text and color
            but.setText("Start ");
            but.setBackground(GREEN);
        }
    }//GEN-LAST:event_startButtonAction

    private void topLeftExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_topLeftExit
    {//GEN-HEADEREND:event_topLeftExit
        System.exit(0);
    }//GEN-LAST:event_topLeftExit

    private void botRightExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botRightExit
    {//GEN-HEADEREND:event_botRightExit
        topLeftExit(evt);
    }//GEN-LAST:event_botRightExit

    private void botLeftExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botLeftExit
    {//GEN-HEADEREND:event_botLeftExit
        topLeftExit(evt);
    }//GEN-LAST:event_botLeftExit

    private void topRightExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_topRightExit
    {//GEN-HEADEREND:event_topRightExit
        topLeftExit(evt);
    }//GEN-LAST:event_topRightExit

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
