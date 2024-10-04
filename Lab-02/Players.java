import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Players{
    private JFrame playerList;
    private DefaultTableModel model;
    private JButton save, print, add, delete;
    private JToolBar toolBar;
    private JScrollPane scroll;
    private JTable players;
    private JComboBox player;
    private JTextField playerName;
    private JButton filter;
    public void show(){
        //Создание окна
        playerList = new JFrame("Список игроков");
        playerList.setSize(500, 300);
        playerList.setLocation(100, 100);
        playerList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Создание Кнопок и прикрепление иконок
        save = new JButton(new ImageIcon("save.png"));
        print = new JButton(new ImageIcon("print.png"));
        add = new JButton(new ImageIcon("add.png"));
        delete = new JButton(new ImageIcon("delete.png"));

        //Настройка подсказок для кнопок
        save.setToolTipText("Save list of players");
        print.setToolTipText("Print");
        add.setToolTipText("Add");
        delete.setToolTipText("Delete");

        //Добавление кнопок на панель инструментов
        toolBar = new JToolBar("Tools");
        toolBar.add(save);
        toolBar.add(add);
        toolBar.add(delete);
        toolBar.add(print);

        //Размещение панели инструментов
        playerList.setLayout(new BorderLayout());
        playerList.add(toolBar, BorderLayout.NORTH);

        //Создание таблицы с данными
        String[] columns = { "Player", "Number", "Position"};
        String[][] data = {{ "Wilmar Barrios", "35", "midfielder"},
                { "Andrey Lunev", "99", "goalkeeper"}};
        model = new DefaultTableModel(data, columns);
        players = new JTable(model);
        scroll = new JScrollPane(players);

        //Размещение таблицы с данными.
        playerList.add(scroll, BorderLayout.CENTER);

        //Подготовка компонентов поиска
        player = new JComboBox(new String[]{"Player", "Wilmar Barrios", "Andrey Lunev"});
        playerName = new JTextField("Player name");
        filter = new JButton("Search");

        //Добавление компонентов на панель
        JPanel filterPanel = new JPanel();
        filterPanel.add(player);
        filterPanel.add(playerName);
        filterPanel.add(filter);

        //Размещение панели поиска внизу окна.
        playerList.add(filterPanel, BorderLayout.SOUTH);

        //Визуализация экранной формы
        players.setBackground(new Color(250,200,200));
        playerList.setVisible(true);
    }
    public static void main(String[] args){
        //Создание и отображение экранной формы.
        new Players().show();
    };
}

