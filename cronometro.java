import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

class Cronometro {

    private JLabel contagemTempo;
    private Timer tm;

    public void init() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame janela = new JFrame("Cronometro");
        janela.setSize(300, 200);
        janela.setAlwaysOnTop(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());

        contagemTempo = new JLabel("00:00:00");
        contagemTempo.setFont(new Font(contagemTempo.getName(), Font.PLAIN, 80));
        janela.add(contagemTempo, BorderLayout.CENTER);

        JPanel painel = new jPanel();
        painel.setLayout(new GridLayout(2,1));

        JButton btIniciar = new jButton("Iniciar");
        btIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionListener e) {
                tm = new Timer();
                tm.scheduleAtFixedRate(new TimerTask() {

                }, 1000, 1000); 
                );
            }
        }
        );
        JButton btParar = new jButton("Parar");

        painel.add(btIniciar);
        painel.add(btParar);

        janela.add(painel);
        janela.pack();


        

    }
    public static void main(String[] args) {
        Cronometro c = new Cronometro();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                c.init();
            }
        }
        
        );
    }
}

/*cronmetro com java*/
