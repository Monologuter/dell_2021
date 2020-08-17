package dell.Day11_0817.OverRide;

/**
 * @Author 马小姐
 * @Date 2020/8/17 11:00
 * @Version 1.0
 * @Description:
 */
    //智能手机类
    class SuperPhone extends Phone{
        //覆盖父类的来电显示号码功能，并增加自己的显示姓名和图片功能
        @Override
        public void showNum(){
            //调用父类已经存在的功能使用super
            super.showNum();
            //增加自己特有显示姓名和图片功能
            System.out.println("显示来电姓名");
            System.out.println("显示头像");
        }
    }

