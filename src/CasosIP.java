
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.parser.TokenType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shary
 */
public class CasosIP {

    public JTextField texto;
    public String IP = "";
    public int v = 0, x = 0;

    public CasosIP(JTextField texto1) {
        texto = texto1;
        IP = texto.getText();
    }

    public void eleccion() {
        if (texto.getText().length() > 15 || texto.getText().length() < 11) {
            x = 1;
        } else if (texto.getText().length() == 15) {
            x = 2;
        } else if (texto.getText().length() == 14) {
            x = 3;
        } else if (texto.getText().length() == 13) {
            x = 4;
        } else if (texto.getText().length() == 12) {
            x = 5;
        } else if (texto.getText().length() == 11) {
            x = 6;
        }
    }

    public void NoIP() {
        try {
            JOptionPane.showMessageDialog(null, "Ingrese una IP valida", "IP NO VALIDO", JOptionPane.INFORMATION_MESSAGE);
            texto.setText("");
            texto.requestFocus();
        } catch (Exception e) {
        }

    }

    public void IP_15() {
        try {
            if (!IP.matches("^.{0}\\d{3}.*$")) {
                IP = IP.substring(0, 0) + "000" + IP.substring(3);
                v = 1;
            }
            if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(11, 12))) {
                v = 2;
            }
            if (!IP.matches("^.{4}\\d{3}.*$")) {
                IP = IP.substring(0, 4) + "000" + IP.substring(7);
                v = 1;
            }
            if (!IP.matches("^.{8}\\d{3}.*$")) {
                IP = IP.substring(0, 8) + "000" + IP.substring(11);
                v = 1;
            }
            if (!IP.matches("^.{12}\\d{3}.*$")) {
                IP = IP.substring(0, 12) + "000" + IP.substring(15);
                v = 1;
            }
            if (v == 1) {
                JOptionPane.showMessageDialog(null, IP + " Invalido");
            } else if (v == 2) {
                JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                texto.setText("");
            } else if (v != 1 && v != 2) {
                variables.setIpServer(IP);
            }

        } catch (Exception e) {
        }
    }

    public void IP_14() {
        try {
            if (".".equals(IP.substring(11, 12))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(11, 12))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{3}.*$")) {
                    IP = IP.substring(0, 8) + "000" + IP.substring(11);
                    v = 1;
                }
                if (!IP.matches("^.{12}\\d{2}.*$")) {
                    IP = IP.substring(0, 12) + "00" + IP.substring(14);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }

            } else if ("."
                    .equals(IP.substring(10, 11))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(10, 11))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{2}.*$")) {
                    IP = IP.substring(0, 8) + "00" + IP.substring(10);
                    v = 1;
                }
                if (!IP.matches("^.{11}\\d{3}.*$")) {
                    IP = IP.substring(0, 11) + "000" + IP.substring(14);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }

            }

        } catch (Exception e) {
        }
    }

    public void IP_13() {
        try {
            if (".".equals(IP.substring(11, 12))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(11, 12))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{3}.*$")) {
                    IP = IP.substring(0, 8) + "000" + IP.substring(11);
                    v = 1;
                }
                if (!IP.matches("^.{12}\\d{1}.*$")) {
                    IP = IP.substring(0, 12) + "00" + IP.substring(13);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }

            } else if ("."
                    .equals(IP.substring(10, 11))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(10, 11))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{2}.*$")) {
                    IP = IP.substring(0, 8) + "00" + IP.substring(10);
                    v = 1;
                }
                if (!IP.matches("^.{11}\\d{2}.*$")) {
                    IP = IP.substring(0, 11) + "00" + IP.substring(13);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }
            } else if ("."
                    .equals(IP.substring(9, 10))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(9, 10))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{1}.*$")) {
                    IP = IP.substring(0, 8) + "0" + IP.substring(9);
                    v = 1;
                }
                if (!IP.matches("^.{10}\\d{3}.*$")) {
                    IP = IP.substring(0, 10) + "000" + IP.substring(13);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }
            }

        } catch (Exception e) {
        }
    }

    public void IP_12() {
        try {
            if ("."
                    .equals(IP.substring(10, 11))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(10, 11))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{2}.*$")) {
                    IP = IP.substring(0, 8) + "00" + IP.substring(10);
                    v = 1;
                }
                if (!IP.matches("^.{11}\\d{1}.*$")) {
                    IP = IP.substring(0, 11) + "0" + IP.substring(12);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }
            } else if ("."
                    .equals(IP.substring(9, 10))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(9, 10))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{1}.*$")) {
                    IP = IP.substring(0, 8) + "0" + IP.substring(9);
                    v = 1;
                }
                if (!IP.matches("^.{10}\\d{2}.*$")) {
                    IP = IP.substring(0, 10) + "00" + IP.substring(12);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }
            }

        } catch (Exception e) {
        }
    }

    public void IP_11() {
        try {
            if ("."
                    .equals(IP.substring(9, 10))) {
                if (!IP.matches("^.{0}\\d{3}.*$")) {
                    IP = IP.substring(0, 0) + "000" + IP.substring(3);
                    v = 1;
                }
                if (!".".equals(IP.substring(3, 4)) || !".".equals(IP.substring(7, 8)) || !".".equals(IP.substring(9, 10))) {
                    v = 2;
                }
                if (!IP.matches("^.{4}\\d{3}.*$")) {
                    IP = IP.substring(0, 4) + "000" + IP.substring(7);
                    v = 1;
                }
                if (!IP.matches("^.{8}\\d{1}.*$")) {
                    IP = IP.substring(0, 8) + "0" + IP.substring(9);
                    v = 1;
                }
                if (!IP.matches("^.{10}\\d{1}.*$")) {
                    IP = IP.substring(0, 10) + "0" + IP.substring(11);
                    v = 1;
                }
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, IP + " Invalido");
                } else if (v == 2) {
                    JOptionPane.showMessageDialog(null, "Verifique la Direccion IP", "Verificar", JOptionPane.ERROR_MESSAGE);
                    texto.setText("");
                } else if (v != 1 && v != 2) {
                    variables.setIpServer(IP);
                }
            }

        } catch (Exception e) {
        }
    }

}
