package section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static section01.Template.getSqlSession;

    public class Service {

        private Mapper Mapper;

        public List<EmployeeDTO> allEmployee() {

            SqlSession sqlSession = getSqlSession();

            Mapper = sqlSession.getMapper(Mapper.class);

            List<EmployeeDTO> employeeList = Mapper.allEmployee();

            sqlSession.close();

            return employeeList;

        }

        public EmployeeDTO employByCode(int empId) {

            SqlSession sqlSession = getSqlSession();

            Mapper = sqlSession.getMapper(Mapper.class);

            EmployeeDTO employ = Mapper.employByCode(empId);

            sqlSession.close();

            return employ;
        }


        public EmployeeDTO registemployee(int empNo) {

            SqlSession sqlSession = getSqlSession();

            Mapper = sqlSession.getMapper(Mapper.class);

            EmployeeDTO employ = Mapper.employByCode(empNo);

            sqlSession.close();

            return employ;
        }




}
