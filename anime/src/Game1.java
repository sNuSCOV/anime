import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game1 extends JPanel implements ActionListener {
    private Timer timer;
    private int x1, y1, x2, y2;
    private int delta = 5;
    private Image buster, snickers1;
    
    public Game1() {
        // Загрузка картинок из файлов
        buster = new ImageIcon("buster.png").getImage();
        snickers1 = new ImageIcon("snickers1.png").getImage();
        
        // Задание начальных координат
        x1 = 50;
        y1 = 50;
        x2 = 300;
        y2 = 200;
        
        // Создание таймера с интервалом 10 миллисекунд
        timer = new Timer(10, this);
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Отрисовка картинок
        g.drawImage(buster, x1, y1, this);
        g.drawImage(snickers1, x2, y2, this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Перемещение картинок
        x1 += delta;
        y1 += delta;
        x2 -= delta;
        y2 -= delta;
        
        // Изменение направления движения картинок при достижении границ окна
        if (x1 <= 0 || x1 + buster.getWidth(this) >= getWidth()) {
            delta = -delta;
        }
        
        // Перерисовка окна
        repaint();
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        Game panel = new Game();
        frame.add(panel);
        
        frame.setVisible(true);
    }
}