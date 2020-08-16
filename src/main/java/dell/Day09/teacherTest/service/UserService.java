package dell.Day09.teacherTest.service;


import dell.Day09.teacherTest.model.User;

/**
 * 处理用户功能逻辑（对用户的增、删、改、查）
 */
public class UserService {
    //存放多个用户信息
     private User[] users;
    //记录用户的总数
    private  int total;



    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 初始化用户数组的长度
     * @param userCount 用户个数
     */
    public UserService(int userCount){
        users=new User[userCount];
    }
    //用户列表
    public  User[] getUserList(){
        User[] userInfos=new User[total];
        for(int i=0;i<userInfos.length;i++){
            userInfos[i] = users[i];
        }
        return userInfos;
    }

    //新增用户
    public boolean addUser(User user){
        if(total>=users.length){
            System.out.println("当前用户数量已满");
            return false;
        }
        users[total]=user;
        total++;
        return true;
    }

    //删除用户
    public  boolean deleteUser(int id){
        if(id-1<0||id>total){
            System.out.println("当前用户不存在");
            return false;
        }

        for(int i=id-1;i<total-1;i++){
            users[i]=users[i+1];
        }
        users[total-1]=null;
        total--;
        return true;
    }
    //修改用户
    public boolean updateUser(User user){
        if(user.getId()-1<0||user.getId()>total){
            System.out.println("当前用户不存在");
            return false;
        }
        users[user.getId()-1]=user;
        return true;
    }
    //获取总数
    public int getTotal(){
        return total;
    }

}
