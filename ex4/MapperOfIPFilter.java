package No4;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapperOfIPFilter {
public static void main(String[] args) throws ParseException, FileNotFoundException{
		
		Locale locale = Locale.US; 
		SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", locale);
		
		SimpleDateFormat regularFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date beginDate = regularFormat.parse(args[0]);
		Date endDate = regularFormat.parse(args[1]);
		
//		String filePath = "H:/Tmp./access.log";
//		FileInputStream inputStream = new FileInputStream(filePath);
		Scanner scanner = new Scanner(System.in);
		
		String pattern = "(\\d+.\\d+.\\d+.\\d+) [^ ]* [^ ]* \\[([^ ]* [^ ]*)\\] \"[^ ]+ ([^ ]+) .*\" \\d+ \\d+ \"(.*)\" \"(.*)\"";
		Pattern p = Pattern.compile(pattern);
		
		while (scanner.hasNext()){
			// 对每行进行处理
			String line = scanner.nextLine();
			// 切分获取IP，Time
			String strIp = null;
			String strTime = null;
			

			Matcher m = p.matcher(line);
			if (m.find()) {
				strIp = m.group(1);
				strTime = m.group(2);
				Date Time = inputFormat.parse(strTime);
				if (Time.before(endDate) && Time.after(beginDate)) {
					
					// 对在时间区间内的数据进行输出
					System.out.println(strIp);
				}
			}
		}
}
}
