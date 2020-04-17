//package procedure;
//
///**
// * Created by asus on 2019/09/06.
// */
//
//
////DELIMITER $$
////        CREATE PROCEDURE get_candidate_skill(IN candidate_id INT)
////        BEGIN
////        SELECT candidates.id, first_name,last_name, skills.name AS skill
////        FROM candidates
////        INNER JOIN candidate_skills ON candidates.id = candidate_skills.candidate_id
////        INNER JOIN skills ON skills.id = candidate_skills.skill_id
////        WHERE candidates.id = candidate_id;
////        END$$
////        DELIMITER ;
//
//
//
//
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.CallableStatement;
//
//
//public class Sample2 {
//
//    /**
//     * Get skills by candidate id
//     *
//     * @param candidateId
//     */
//    public static void getSkills(int candidateId) {
//        //
//        String query = "{ call get_candidate_skill(?) }";
//        ResultSet rs;
//
//        try (Connection conn = MySQLJDBCUtil.getConnection();
//             CallableStatement stmt = conn.prepareCall(query)) {
//
//            stmt.setInt(1, candidateId);
//
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println(String.format("%s - %s",
//                        rs.getString("first_name") + " "
//                                + rs.getString("last_name"),
//                        rs.getString("skill")));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        getSkills(122);
//    }
//}
