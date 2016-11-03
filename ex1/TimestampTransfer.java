package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		//生成一个获取控制台输入日期的Scanner对象
		Scanner scanner = new Scanner(System.in);
		
		//生成一个用于接收“yyyy-MM-dd HH:mm:ss”格式日期的对象
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//生成一个用于个格式化输出日期的对象
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		
		while (scanner.hasNext()){
			
			//从控制台获取输入的日期，存储为String类型
			String line = scanner.nextLine();
			
			//定义一个Date类型的变量
			Date lineDate = null;
			
			//定义一个长整型变量
			long lineTimestamp;
			
		
			/**日期时间从控制台输入到输出的变换过程
			 * string = scanner.nextline(控制台) >>
			 * Date = SimpleDateFormat.parse(string) >> 
			 * long = Date.getTime(date)
			 */
			
			try {
				
				//inputFormat接收一个String类型的日期时间并格式化为Date类型，赋值给lineDate；
				lineDate = inputFormat.parse(line);
				
				//LineDate调用Date.getTime方法，将日期时间转化为时间戳
				lineTimestamp = lineDate.getTime();
				
				//outputFormat.format接收一个Date类型的变量并格式化String类型+" to "+时间戳，并打印输出
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
