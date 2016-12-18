import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;

public class admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO JAVA");
        Connection con=null;
        Connection con1=null;/*一个连接*/
	    
	    try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");/*加载一个驱动*/
	    //建立数据库连接//
	    con=DriverManager.getConnection("jdbc:sqlserver://192.168.0.11:1433; DatabaseName=Account","sa","123");
	    con1=DriverManager.getConnection("jdbc:sqlserver://192.168.0.11:1433;DatabaseName=Administrator","sa","123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//引号内写连接字符串//
        if(con!=null&con1!=null)
	    	System.out.println("连接已经成功了啊！");
        JFrame frm=new JFrame();
        frm.setTitle("管理员");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//建立窗口
        JPanel panel1=new JPanel();
        frm.getContentPane().add(panel1,BorderLayout.CENTER);
        JPanel panel2=new JPanel();
        frm.getContentPane().add(panel2, BorderLayout.NORTH);//面板
        JLabel label1=new JLabel();
        label1.setText("管理员账号登录");
        label1.setFont(new Font("宋体",Font.BOLD,16));
        panel2.add(label1);//将控件加入面板
        JLabel laccount=new JLabel();
        laccount.setText("管理员账号：");
        JLabel lpas=new JLabel();
        lpas.setText("密码");
        JTextField taccount = new JTextField(15);
        JPasswordField tpas = new JPasswordField(20);//static
        JButton ok = new JButton("ok");
        ok.setText("登录");
        JButton cancel = new JButton("cancel");
        cancel.setText("退出");
        
        panel1.add(laccount);panel1.add(taccount);
        panel1.add(lpas);panel1.add(tpas);
        panel1.add(ok);panel1.add(cancel);//登录界面
        
        
        
        frm.setBounds(500, 300, 400, 200);
        frm.setVisible(true);

	}

}
