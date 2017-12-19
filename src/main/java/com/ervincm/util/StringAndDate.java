package com.ervincm.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringAndDate {

	/**
	   * 两个时间之间的天数
	   *
	   * @param date1
	   * @param date2
	   * @return
	   */
	  public static long getDays(String date1, String date2) {
	    if (date1 == null || date1.equals(""))
	      return 0;
	    if (date2 == null || date2.equals(""))
	      return 0;
	    // 转换为标准时间
	    SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = null;
	    Date mydate = null;
	    try {
	      date = myFormatter.parse(date1);
	      mydate = myFormatter.parse(date2);
	    } catch (Exception e) {
	    }
	    long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
	    return day;
	  }
	  /**
	   * 两个时间之间的分钟数
	   *
	   * @param date1
	   * @param date2
	   * @return
	   */
	  public static long getMinutes(String date1, String date2) {
	    if (date1 == null || date1.equals(""))
	      return 0;
	    if (date2 == null || date2.equals(""))
	      return 0;
	    // 转换为标准时间
	    SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date = null;
	    Date mydate = null;
	    try {
	      date = myFormatter.parse(date1);
	      mydate = myFormatter.parse(date2);
	    } catch (Exception e) {
	    }
	    long day = (date.getTime() - mydate.getTime()) / ( 60 * 1000);
	    return day;
	  }
	  
	  /** 
	   * 获取现在时间 
	   *  
	   * @return返回字符串格式 yyyy-MM-dd HH:mm:ss 
	   */  
	  public static String getStringDate() {  
	      Date currentTime = new Date();  
	      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	      String dateString = formatter.format(currentTime);  
	      return dateString;  
	  }  
	  
	  /**
	     * 获取现在时间
	     *
	     * @return 返回短时间字符串格式yyyy-MM-dd
	     */
	    public static String getStringDateShort() {
	      Date currentTime = new Date();
	      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	      String dateString = formatter.format(currentTime);
	      return dateString;
	    }
	  /**
	     * 将短时间格式字符串转换为时间 yyyy-MM-dd
	     *
	     * @param strDate
	     * @return
	     */
	    public static Date strToDate(String strDate) {
	      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	      ParsePosition pos = new ParsePosition(0);
	      Date strtodate = formatter.parse(strDate, pos);
	      return strtodate;
	    }
	   
	      /**
	       * 获取格式化的时间
	       * 输出格式：2015-08-04 20:55:35
	       */
	    
	      public static String getFormatDate(){
	        Date date = new Date();
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String dateString = formatter.format(date);
	        return dateString;
	      }
	    
	    /**
	     * 获取现在时间
	     *
	     * @return返回短时间格式 yyyy-MM-dd
	     */
	    public static Date getNowDateShort() {
	      Date currentTime = new Date();
	      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	      String dateString = formatter.format(currentTime);
	      ParsePosition pos = new ParsePosition(0);
	      Date currentTime_2 = formatter.parse(dateString, pos);
	      return currentTime_2;
	    }
	    public static void main(String[] args) {// 测试方法
	    System.out.println(getMinutes("2017-12-18 19:59:00", getStringDate()));
	    System.out.println(getFormatDate());
	    System.out.println(getStringDateShort());
	    System.out.println(strToDate(getStringDateShort()));
	    }
	  
}
