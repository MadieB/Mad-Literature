/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 800141
 */
public class MadLiterature extends javax.swing.JFrame {
        String useName;
        String verb; 
        String adjective;
        String name;
        int number; 
        String date;
        String color;
        String food;
        String animal;
        String interjection;
        String object;
        String place;
        String adverb;
    
        String[] madLib;
        
    /**
     * Creates new form MadLiterature
     */
    public MadLiterature() {
        madLib = new String[4];
       
        initComponents();
        
    }

    /**questionBox.setText("What is your first name?");
        useName = inputBox.getText();
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        storyBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        AnimalBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        storyButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FoodBox = new javax.swing.JTextField();
        PlaceBox = new javax.swing.JTextField();
        ObjectBox = new javax.swing.JTextField();
        VerbBox = new javax.swing.JTextField();
        ColorBox = new javax.swing.JTextField();
        AdjectiveBox = new javax.swing.JTextField();
        InterjectionBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DateBox = new javax.swing.JTextField();
        NameBox = new javax.swing.JTextField();
        AdverbBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NumberBox = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        UserBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        storyBox.setBackground(new java.awt.Color(0, 0, 0));
        storyBox.setColumns(20);
        storyBox.setFont(new java.awt.Font("Kristen ITC", 0, 13)); // NOI18N
        storyBox.setForeground(new java.awt.Color(255, 255, 255));
        storyBox.setRows(5);
        jScrollPane1.setViewportView(storyBox);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("             MAD LITERATURE");
        jLabel1.setOpaque(true);

        AnimalBox.setBackground(new java.awt.Color(0, 0, 0));
        AnimalBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        AnimalBox.setForeground(new java.awt.Color(0, 255, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("Instructions:  Answer the questions by typing in the input boxes. ");
        jLabel2.setOpaque(true);

        storyButton.setBackground(new java.awt.Color(0, 0, 0));
        storyButton.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        storyButton.setForeground(new java.awt.Color(255, 255, 0));
        storyButton.setText("STORY");
        storyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText(" Hit STORY after filling out all the requested information");
        jLabel3.setOpaque(true);

        FoodBox.setBackground(new java.awt.Color(0, 0, 0));
        FoodBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        FoodBox.setForeground(new java.awt.Color(0, 255, 51));

        PlaceBox.setBackground(new java.awt.Color(0, 0, 0));
        PlaceBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        PlaceBox.setForeground(new java.awt.Color(0, 255, 51));

        ObjectBox.setBackground(new java.awt.Color(0, 0, 0));
        ObjectBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        ObjectBox.setForeground(new java.awt.Color(0, 255, 51));

        VerbBox.setBackground(new java.awt.Color(0, 0, 0));
        VerbBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        VerbBox.setForeground(new java.awt.Color(0, 255, 51));

        ColorBox.setBackground(new java.awt.Color(0, 0, 0));
        ColorBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        ColorBox.setForeground(new java.awt.Color(0, 255, 51));

        AdjectiveBox.setBackground(new java.awt.Color(0, 0, 0));
        AdjectiveBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        AdjectiveBox.setForeground(new java.awt.Color(0, 255, 51));
        AdjectiveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjectiveBoxActionPerformed(evt);
            }
        });

        InterjectionBox.setBackground(new java.awt.Color(0, 0, 0));
        InterjectionBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        InterjectionBox.setForeground(new java.awt.Color(0, 255, 51));
        InterjectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterjectionBoxActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Food");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Animal");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Place");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Object");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Verb");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 255));
        jLabel9.setText("Color");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 255));
        jLabel10.setText("Interjection");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 255));
        jLabel11.setText("Adjective");
        jLabel11.setOpaque(true);

        DateBox.setBackground(new java.awt.Color(0, 0, 0));
        DateBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        DateBox.setForeground(new java.awt.Color(0, 255, 51));

        NameBox.setBackground(new java.awt.Color(0, 0, 0));
        NameBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        NameBox.setForeground(new java.awt.Color(0, 255, 51));
        NameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameBoxActionPerformed(evt);
            }
        });

        AdverbBox.setBackground(new java.awt.Color(0, 0, 0));
        AdverbBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        AdverbBox.setForeground(new java.awt.Color(0, 255, 51));
        AdverbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdverbBoxActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 255));
        jLabel12.setText("Number");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 255));
        jLabel13.setText("Date");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 255, 255));
        jLabel14.setText("Adverb");
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 255));
        jLabel15.setText("Name");
        jLabel15.setOpaque(true);

        NumberBox.setBackground(new java.awt.Color(0, 0, 0));
        NumberBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        NumberBox.setForeground(new java.awt.Color(0, 255, 51));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("User Name (capitalize first letter)");
        jLabel16.setOpaque(true);

        UserBox.setBackground(new java.awt.Color(0, 0, 0));
        UserBox.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        UserBox.setForeground(new java.awt.Color(255, 102, 0));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 255));
        jLabel17.setText("Enjoy your silly story");
        jLabel17.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ObjectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PlaceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FoodBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnimalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AdjectiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InterjectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VerbBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UserBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdverbBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(storyButton)
                        .addGap(474, 474, 474))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(UserBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoodBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnimalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlaceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InterjectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ObjectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdjectiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdverbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(48, 48, 48)
                .addComponent(storyButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMadLib(){
        //This is where the madlibs are
        
        madLib[0] = "\n On a " + adjective + ", summer day, a white "+ animal + " " + verb +" by you and said, “Hello" + " " + name + "“."+
        "\n “Hello white "+ animal + " " + "“ as you " + verb + ". " + "The little white" + " " + animal + " " + "continued on it's way as you continued on yours." +
        "\n Along the way, you hear someone call out “Hello " + name + "“. " + "You turn to see the Mad Hatter." + 
        "\n He hands you a china tea cup, though nothing appears to be in it. He then pores a" + " " + color + " " + "liquid in cup"+
        "\n You give him a strange look before continuing on your way. While walking you see a floating" + " " + food + " " + " and then a cresent smile. " +
        "\n Your eyes widen as you say “" + interjection + "“. " + "The cheshire cat laughs at you as he disappears again." +
        "\n Continuing to walk, you think to yourself, 'This has been one" + " " + adjective + " " + " day.'";
        
        madLib[1] = "\n It was a " + adjective + " " + "night. You stare out the window, nothing seemingly interesting until" + name + " " + "appears in front of you"+
        "\n Your heart stops as " + interjection + " " + "escapes your lips." + name + " " + "begins to " + verb + " " + "around you. Suddenly everything around you disappears as" +
        "\n you reappear in" + place + ". Your mind has now completely taken over. Now random" + food + " " + "begins" + adverb + " " + "for" + number + " " + "hours."+
        "\n You begin questioning the madness going on around you." + object + " " + "begin appearing as you travel through time. Upon arrival you see it is" + date + "."+
        "\n You" + verb + " " + "yourself and your eyes open to see everything around you is back to normal";
        
        madLib[2] = "\n A new and " + adjective + " " + "fairy princess is coming out soon! It will be about" + name + " " + "and the " + number + " " + " unicorns. Princess" +name+
        "\n is more" + adjective + " " + "than the current queen." + name + " " + "is forced to" + verb + " " + "from the kingdom and hide in the nearby" + place + "." +
        "\n There she discovers the unicorns. She lives a normal life until" + number + " " + "days pass. The gueen discovers her location. She sends" + animal +
        "\n after her. The unicorns defend her from the queen's servent until finally Prince" + food + " " + "comes to her rescue. Together they live" + adjective +
        "\n ever after!";
       
        madLib[3] = "\n Let's build a snowman! First we need to have a really" + adjective + " " + "snowstorm, of course on "+ date + ". Watching all that" + object +
        "\n fall makes me" + verb + " " + "for a bowl of" + food + " " + "!" +interjection + "it's still" +adverb+ "abd there's alot of it! Let's go! Next is" + verb +
        "\n to go out in the cold. Once that is done, we need to get busy. We make a" +object+ "and" +verb+ "it in the" + place + ". It gets so" + verb +
        "\n we can't roll it anymore. Then we do" + number + " " + "more and stack them on top of each other. We" +verb+ "for" + object + " " + "in the driveway for the"+
        "\n mouth, eyes, and ears. Mom gives us a scarf, hat, and " + food + " " + "to complete Mr." + name + "!" + interjection + " " + "he's done!";
        
    }
    
    
    private void storyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyButtonActionPerformed
        //This button is responsible to say "Print story"
        
        useName = UserBox.getText();
        verb = VerbBox.getText(); 
        adjective = AdjectiveBox.getText();
        name = NameBox.getText();
        number = Integer.parseInt(NumberBox.getText());
        date = DateBox.getText();
        color = ColorBox.getText();
        food = FoodBox.getText();
        animal = AnimalBox.getText();
        interjection = InterjectionBox.getText();
        object = ObjectBox.getText();
        place = PlaceBox.getText();
        adverb = AdverbBox.getText();
        
        initMadLib();
        storyBox.setText(madLib[0]);
    }//GEN-LAST:event_storyButtonActionPerformed

    //ignore inputBoxes action below! This happened while setting them up. They do nothing....
    private void AdjectiveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdjectiveBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdjectiveBoxActionPerformed

    private void InterjectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterjectionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InterjectionBoxActionPerformed

    private void NameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameBoxActionPerformed

    private void AdverbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdverbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdverbBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MadLiterature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MadLiterature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MadLiterature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MadLiterature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MadLiterature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdjectiveBox;
    private javax.swing.JTextField AdverbBox;
    private javax.swing.JTextField AnimalBox;
    private javax.swing.JTextField ColorBox;
    private javax.swing.JTextField DateBox;
    private javax.swing.JTextField FoodBox;
    private javax.swing.JTextField InterjectionBox;
    private javax.swing.JTextField NameBox;
    private javax.swing.JTextField NumberBox;
    private javax.swing.JTextField ObjectBox;
    private javax.swing.JTextField PlaceBox;
    private javax.swing.JTextField UserBox;
    private javax.swing.JTextField VerbBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea storyBox;
    private javax.swing.JButton storyButton;
    // End of variables declaration//GEN-END:variables
}
