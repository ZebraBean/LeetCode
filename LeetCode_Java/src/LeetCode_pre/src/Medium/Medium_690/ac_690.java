package LeetCode.Medium_690;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/18
 * Time: 17:49
 * Description: No Description
 */
public class ac_690 {
}
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Employee targetEmployee = getEmployeeByID(employees,id);
        int ans = 0;
        return getIpt(employees,targetEmployee);
    }
    public int getIpt(List<Employee> employees,Employee employee){
        //这个实际上就是dfs，这里可以将id作为参数传入，空间上的开销会小一点
        if (employee.subordinates.isEmpty()){
            return employee.importance;
        }
        int ans = 0;
        ans += employee.importance;
        for (int i = 0; i < employee.subordinates.size(); i++) {
            Employee tempEmployee = getEmployeeByID(employees,employee.subordinates.get(i));
            ans+=getIpt(employees,tempEmployee);
        }
        return ans;
    }
    public Employee getEmployeeByID(List<Employee> employees,int id){  //根据id找员工，可以使用map
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }
}


class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};