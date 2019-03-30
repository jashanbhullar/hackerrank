import calendar
month , day , year = map(int , input().split())
ls = ['MONDAY','TUESDAY','WEDNESDAY','THURSDAY','FRIDAY','SATURDAY','SUNDAY']
print(ls[calendar.weekday(year,month,day)])