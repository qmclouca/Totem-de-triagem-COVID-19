package com.rlbpc.programacaosistemasiatividademapa;
import com.rlbpc.programacaosistemasiatividademapa.entities.Prontuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import static com.rlbpc.programacaosistemasiatividademapa.ValidaCPF.isCPF;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Rodolfo Bortoluzzi
 */
public class totemTriagem extends javax.swing.JFrame {
    List<Prontuario> listaProntuarios = new ArrayList<Prontuario>();   
    Prontuario prontuario = new Prontuario();
    String encaminhamento = "";        
    public totemTriagem() {        
        initComponents();           
    }
    
    public int calculaPontuacao(){
        int pontuacao = 0;
        if (prontuario.getTemFeb()) pontuacao += 5;
        if (prontuario.getTemDorCab()) pontuacao++;
        if (prontuario.getTemSecrNasalEsp()) pontuacao++;
        if (prontuario.getTemDorIrrGarg()) pontuacao++;
        if (prontuario.getTemTosse()) pontuacao += 3;
        if (prontuario.getTemDifResp()) pontuacao += 10;
        if (prontuario.getTemDorCorp()) pontuacao++;
        if (prontuario.getTemDiarr()) pontuacao++;
        if (prontuario.getTemContCOVID()) pontuacao += 10;
        if (prontuario.getTemLocGA()) pontuacao += 3;        
        System.out.println(pontuacao);
        return pontuacao;
    }
    
    public void salvaProntuario(String fileName, List<Prontuario> list) throws Exception {
	FileWriter fw = null;
	BufferedWriter bw = null;
            try {
		fw = new FileWriter(new File(fileName));
		bw = new BufferedWriter(fw);
		for (int i=0; listaProntuarios != null && i<listaProntuarios.size(); i++){
                    bw.write(listaProntuarios.get(i).toString());
                    bw.write("\n");
                }
	    } catch (Exception e) {
		System.out.println("ERRO: " + e.getMessage());
		throw e;
	    } finally {
		try {
                    bw.close();
                } catch (Exception e) {System.out.println(e);}
		try {
		    fw.close();
		} catch (Exception e) {System.out.println(e);}
	    }
    }
    
    public void reiniciaAtendimento(){
        listaProntuarios.add(
                new Prontuario(prontuario.getNome(), 
                               prontuario.getSexo(),
                               prontuario.getCpf(),
                               prontuario.getIdade(),
                               prontuario.getTemFeb(),
                               prontuario.getTemDorCab(),
                               prontuario.getTemSecrNasalEsp(),
                               prontuario.getTemDorIrrGarg(),
                               prontuario.getTemTosse(),
                               prontuario.getTemDifResp(),
                               prontuario.getTemDorCorp(),
                               prontuario.getTemDiarr(),
                               prontuario.getTemContCOVID(),
                               prontuario.getTemLocGA()));
        for (Prontuario prontuario:listaProntuarios) System.out.println(prontuario);
        try {
            salvaProntuario("f:/Rodolfo/Dados I/programacaosistemasIatividadeMapa/src/main/java/prontuarios/prontuarios.txt", listaProntuarios);
        } catch (Exception ex) {
            System.out.println("modifique o caminho do arquivo Prontuarios.txt e crie o mesmo antes de rodar o programa." );
            Logger.getLogger(totemTriagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        prontuario.setNome("");
        prontuario.setIdade(null);
        prontuario.setCpf("");
        prontuario.setSexo("");
        prontuario.setTemContCOVID(false);
        prontuario.setTemDiarr(false);
        prontuario.setTemDifResp(false);
        prontuario.setTemDorCab(false);
        prontuario.setTemDorCorp(false);
        prontuario.setTemDorIrrGarg(false);
        prontuario.setTemFeb(false);
        prontuario.setTemLocGA(false);
        prontuario.setTemSecrNasalEsp(false);
        prontuario.setTemTosse(false);
        Nome.setText("");
        Nome.setEnabled(true);
        Idade.setText("");
        Idade.setEnabled(true);
        Cpf.setText("");
        Cpf.setEnabled(true);
        sexoFeminino.setEnabled(true);
        sexoMasculino.setEnabled(true);
        sexoFeminino.setSelected(false);
        sexoMasculino.setSelected(false);
        BtnResponder.setEnabled(true);
        pront1.setSelected(false);
        pront2.setSelected(false);
        pront3.setSelected(false);
        pront4.setSelected(false);
        pront5.setSelected(false);
        pront6.setSelected(false);
        pront7.setSelected(false);
        pront8.setSelected(false);
        pront9.setSelected(false);
        pront10.setSelected(false);
        BtnNovoAtendimento.setEnabled(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexoFeminino = new javax.swing.JCheckBox();
        sexoMasculino = new javax.swing.JCheckBox();
        Idade = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        BtnResponder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Cpf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pront1 = new javax.swing.JCheckBox();
        pront2 = new javax.swing.JCheckBox();
        pront3 = new javax.swing.JCheckBox();
        pront4 = new javax.swing.JCheckBox();
        pront5 = new javax.swing.JCheckBox();
        pront6 = new javax.swing.JCheckBox();
        pront7 = new javax.swing.JCheckBox();
        pront8 = new javax.swing.JCheckBox();
        pront9 = new javax.swing.JCheckBox();
        pront10 = new javax.swing.JCheckBox();
        Encaminhamento = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        BtnCadastrar = new javax.swing.JButton();
        BtnNovoAtendimento = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Totem de Triagem - Rodolfo Bortoluzzi");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Faça seu cadastro:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Idade:");

        sexoFeminino.setText("Feminino");
        sexoFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoFemininoActionPerformed(evt);
            }
        });

        sexoMasculino.setText("Masculino");
        sexoMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoMasculinoActionPerformed(evt);
            }
        });

        BtnResponder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnResponder.setText("Responder questionário");
        BtnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponderActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF:");

        Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfActionPerformed(evt);
            }
        });
        Cpf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CpfPropertyChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFocusable(false);

        pront1.setText("Tem febre?");
        pront1.setEnabled(false);
        pront1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pront1ActionPerformed(evt);
            }
        });

        pront2.setText("Tem dor de cabeça?");
        pront2.setEnabled(false);

        pront3.setText("Tem secreção nasal ou espirros?");
        pront3.setEnabled(false);

        pront4.setText("Tem dor/irritação na garganta?");
        pront4.setEnabled(false);

        pront5.setText("Tem tosse seca?");
        pront5.setEnabled(false);

        pront6.setText("Tem dificuldade respiratória?");
        pront6.setEnabled(false);

        pront7.setText("Tem dores no corpo?");
        pront7.setEnabled(false);

        pront8.setText("Tem diarreia?");
        pront8.setEnabled(false);

        pront9.setText("Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?");
        pront9.setEnabled(false);

        pront10.setText("Esteve em lugar com grande aglomeração?");
        pront10.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pront10)
                    .addComponent(pront9)
                    .addComponent(pront8)
                    .addComponent(pront7)
                    .addComponent(pront6)
                    .addComponent(pront5)
                    .addComponent(pront4)
                    .addComponent(pront3)
                    .addComponent(pront2)
                    .addComponent(pront1))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pront1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pront10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Encaminhamento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        BtnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.setEnabled(false);
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnNovoAtendimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnNovoAtendimento.setText("Finalizar atendimento");
        BtnNovoAtendimento.setEnabled(false);
        BtnNovoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoAtendimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnResponder)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Cpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Idade))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sexoFeminino)
                                        .addGap(44, 44, 44)
                                        .addComponent(sexoMasculino)
                                        .addGap(71, 71, 71)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Encaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(BtnNovoAtendimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sexoFeminino)
                    .addComponent(sexoMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(Encaminhamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BtnNovoAtendimento)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sexoFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoFemininoActionPerformed
        if (sexoFeminino.isSelected()){
            sexoFeminino.setSelected(true);
            sexoMasculino.setSelected(false);            
        }
    }//GEN-LAST:event_sexoFemininoActionPerformed

    public void sexoMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoMasculinoActionPerformed
        if (sexoMasculino.isSelected()){
            sexoMasculino.setSelected(true);
            sexoFeminino.setSelected(false);
        }
    }//GEN-LAST:event_sexoMasculinoActionPerformed

    @SuppressWarnings("empty-statement")
    public void BtnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponderActionPerformed
        String nome = Nome.getText();
        String cpf = Cpf.getText();
        Boolean erro = false;
        Integer idade = 0;
        String errorMessage = "";        
        try {
            if (sexoFeminino.isSelected()){
                prontuario.setSexo("Feminino");
            } else if (sexoMasculino.isSelected()){
                prontuario.setSexo("Masculino");
            } else {
                errorMessage = errorMessage + "Você deve selecionar o seu sexo.\n";
                erro = true;
            };
            if (isCPF(cpf)){
                prontuario.setCpf(cpf);
            } else if (cpf.equals("SAIR")){
                System.exit(0);                
            } else {
                errorMessage = errorMessage + "Você deve informar o seu CPF.\n";
                erro = true;
            };
            if (nome.isEmpty() || nome.length()<5 || nome.contains(" ") == false){
                errorMessage = errorMessage + "Você deve informar seu nome e sobrenome.\n";
                erro = true;
            } else prontuario.setNome(nome);
            idade = Integer.parseInt(Idade.getText());
            if (idade < 140 && idade >= 0){
                if (!erro) {
                    prontuario.setIdade(idade);
                    pront1.setEnabled(true);
                    pront2.setEnabled(true);
                    pront3.setEnabled(true);
                    pront4.setEnabled(true);
                    pront5.setEnabled(true);
                    pront6.setEnabled(true);
                    pront7.setEnabled(true);
                    pront8.setEnabled(true);
                    pront9.setEnabled(true);
                    pront10.setEnabled(true);
                    Nome.setEnabled(false);
                    sexoFeminino.setEnabled(false);
                    sexoMasculino.setEnabled(false);
                    Idade.setEnabled(false);
                    Cpf.setEnabled(false);
                    BtnResponder.setEnabled(false);
                    BtnCadastrar.setEnabled(true);		    
                } else {
                    errorMessage = errorMessage + "Você deve informar a sua idade em anos.\n";
                    erro = true;
                };
                if (erro) {
                    JOptionPane.showMessageDialog(null, errorMessage, "Existe um erro no preenchimento do cadastro.", HEIGHT);
                };
            };    
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Você deve informar seus dados.", "Existe um erro no preenchimento do cadastro.", HEIGHT);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Você deve informar seus dados.", "Existe um erro no preenchimento do cadastro.", HEIGHT);
            System.out.println(ex);
        };  
    }//GEN-LAST:event_BtnResponderActionPerformed

    public void CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpfActionPerformed

    public void CpfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CpfPropertyChange
       
    }//GEN-LAST:event_CpfPropertyChange

    public void pront1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pront1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pront1ActionPerformed

    public void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        int pontuacaoAux = 0;
        
        prontuario.setTemFeb(pront1.isSelected());
        prontuario.setTemDorCab(pront2.isSelected());
        prontuario.setTemSecrNasalEsp(pront3.isSelected());
        prontuario.setTemDorIrrGarg(pront4.isSelected());
        prontuario.setTemTosse(pront5.isSelected());
        prontuario.setTemDifResp(pront6.isSelected());
        prontuario.setTemDorCorp(pront7.isSelected());
        prontuario.setTemDiarr(pront8.isSelected());
        prontuario.setTemContCOVID(pront9.isSelected());
        prontuario.setTemLocGA(pront10.isSelected());
        pontuacaoAux = calculaPontuacao();
        if (pontuacaoAux >=0 && pontuacaoAux <= 9) encaminhamento = "Encaminhe-se para a ala de RISCO BAIXO.";
        if (pontuacaoAux >=10 && pontuacaoAux <= 19) encaminhamento = "Encaminhe-se para a ala de RISCO MÉDIO.";
        if (pontuacaoAux >=20) encaminhamento = "Encaminhe-se para a ala de RISCO ALTO.";      
        pront1.setEnabled(false);
        pront2.setEnabled(false);
        pront3.setEnabled(false);
        pront4.setEnabled(false);
        pront5.setEnabled(false);
        pront6.setEnabled(false);
        pront7.setEnabled(false);
        pront8.setEnabled(false);
        pront9.setEnabled(false);
        pront10.setEnabled(false);
        BtnCadastrar.setEnabled(false);
        BtnNovoAtendimento.setEnabled(true);
        Encaminhamento.setText(encaminhamento);
        
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnNovoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoAtendimentoActionPerformed
        reiniciaAtendimento();
    }//GEN-LAST:event_BtnNovoAtendimentoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(totemTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(totemTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(totemTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(totemTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new totemTriagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnNovoAtendimento;
    public javax.swing.JButton BtnResponder;
    public javax.swing.JTextField Cpf;
    public javax.swing.JLabel Encaminhamento;
    public javax.swing.JTextField Idade;
    public javax.swing.JTextField Nome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JCheckBox pront1;
    public javax.swing.JCheckBox pront10;
    public javax.swing.JCheckBox pront2;
    public javax.swing.JCheckBox pront3;
    public javax.swing.JCheckBox pront4;
    public javax.swing.JCheckBox pront5;
    public javax.swing.JCheckBox pront6;
    public javax.swing.JCheckBox pront7;
    public javax.swing.JCheckBox pront8;
    public javax.swing.JCheckBox pront9;
    public javax.swing.JCheckBox sexoFeminino;
    public javax.swing.JCheckBox sexoMasculino;
    // End of variables declaration//GEN-END:variables
}
