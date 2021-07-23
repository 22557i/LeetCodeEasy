package Google2021;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    Map<Integer, Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e :employees)
            map.put(e.id,e);
        return dfs(id);
    }

    public int dfs(int id){
        Employee e = this.map.get(id);
        int res = e.importance;
        for(Integer subid:e.subordinates)
            res += dfs(subid);
        return res;
    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};