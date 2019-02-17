import java.util.List;

/*
   改接口存放联系人的相关操作
 */
public interface ContactOperator {
    public void addContact(Contact contact);//增加联系人
    public void updateContact(Contact contact);//修改联系人
    public void deleteContact(String id);//删除联系人
    public List<Contact> findAll();//查看所有联系人
}
