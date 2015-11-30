

package org.yatian.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.yatian.dao.keystreamDao;
import org.yatian.entity.keystream;
import org.yatian.utils.JdbcUtil;

public class keystreamDaoImpl implements keystreamDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public void savestream(keystream keystreamin) {
		String sql = "INSERT INTO keystream(pos0,pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,pos10,pos11,pos12,pos13,pos14,pos15,pos16,pos17,pos18,pos19,pos20," +
				"pos21,pos22,pos23,pos24,pos25,pos26,pos27,pos28,pos29,pos30,pos31,pos32,pos33,pos34,pos35,pos36,pos37,pos38,pos39,pos40,pos41,pos42,pos43,pos44,pos45,pos46," +
				"pos47,pos48,pos49,pos50,pos51,pos52,pos53,pos54,pos55,pos56,pos57,pos58,pos59,pos60,pos61,pos62,pos63,pos64,pos65,pos66,pos67,pos68,pos69,pos70,pos71," +
				"pos72,pos73,pos74,pos75,pos76,pos77,pos78,pos79,pos80,pos81,pos82,pos83,pos84,pos85,pos86,pos87,pos88,pos89,pos90,pos91,pos92,pos93,pos94,pos95,pos96," +
				"pos97,pos98,pos99,pos100,pos101,pos102,pos103,pos104,pos105,pos106,pos107,pos108,pos109,pos110,pos111,pos112,pos113,pos114,pos115,pos116,pos117,pos118," +
				"pos119,pos120,pos121,pos122,pos123,pos124,pos125,pos126,pos127,keylength,times,plaintext) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		
		try {
			con = org.yatian.utils.JdbcUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setLong(1, keystreamin.getPos0());
			pstmt.setLong(2, keystreamin.getPos1());
			pstmt.setLong(3, keystreamin.getPos2());
			pstmt.setLong(4, keystreamin.getPos3());
			pstmt.setLong(5, keystreamin.getPos4());
			pstmt.setLong(6, keystreamin.getPos5());
			pstmt.setLong(7, keystreamin.getPos6());
			pstmt.setLong(8, keystreamin.getPos7());
			pstmt.setLong(9, keystreamin.getPos8());
			pstmt.setLong(10, keystreamin.getPos9());
			pstmt.setLong(11, keystreamin.getPos10());
			pstmt.setLong(12, keystreamin.getPos11());
			pstmt.setLong(13, keystreamin.getPos12());
			pstmt.setLong(14, keystreamin.getPos13());
			pstmt.setLong(15, keystreamin.getPos14());
			pstmt.setLong(16, keystreamin.getPos15());
			pstmt.setLong(17, keystreamin.getPos16());
			pstmt.setLong(18, keystreamin.getPos17());
			pstmt.setLong(19, keystreamin.getPos18());
			pstmt.setLong(20, keystreamin.getPos19());
			pstmt.setLong(21, keystreamin.getPos20());
			pstmt.setLong(22, keystreamin.getPos21());
			pstmt.setLong(23, keystreamin.getPos22());
			pstmt.setLong(24, keystreamin.getPos23());
			pstmt.setLong(25, keystreamin.getPos24());
			pstmt.setLong(26, keystreamin.getPos25());
			pstmt.setLong(27, keystreamin.getPos26());
			pstmt.setLong(28, keystreamin.getPos27());
			pstmt.setLong(29, keystreamin.getPos28());
			pstmt.setLong(30, keystreamin.getPos29());
			pstmt.setLong(31, keystreamin.getPos30());
			pstmt.setLong(32, keystreamin.getPos31());
			pstmt.setLong(33, keystreamin.getPos32());
			pstmt.setLong(34, keystreamin.getPos33());
			pstmt.setLong(35, keystreamin.getPos34());
			pstmt.setLong(36, keystreamin.getPos35());
			pstmt.setLong(37, keystreamin.getPos36());
			pstmt.setLong(38, keystreamin.getPos37());
			pstmt.setLong(39, keystreamin.getPos38());
			pstmt.setLong(40, keystreamin.getPos39());
			pstmt.setLong(41, keystreamin.getPos40());
			pstmt.setLong(42, keystreamin.getPos41());
			pstmt.setLong(43, keystreamin.getPos42());
			pstmt.setLong(44, keystreamin.getPos43());
			pstmt.setLong(45, keystreamin.getPos44());
			pstmt.setLong(46, keystreamin.getPos45());
			pstmt.setLong(47, keystreamin.getPos46());
			pstmt.setLong(48, keystreamin.getPos47());
			pstmt.setLong(49, keystreamin.getPos48());
			pstmt.setLong(50, keystreamin.getPos49());
			pstmt.setLong(51, keystreamin.getPos50());
			pstmt.setLong(52, keystreamin.getPos51());
			pstmt.setLong(53, keystreamin.getPos52());
			pstmt.setLong(54, keystreamin.getPos53());
			pstmt.setLong(55, keystreamin.getPos54());
			pstmt.setLong(56, keystreamin.getPos55());
			pstmt.setLong(57, keystreamin.getPos56());
			pstmt.setLong(58, keystreamin.getPos57());
			pstmt.setLong(59, keystreamin.getPos58());
			pstmt.setLong(60, keystreamin.getPos59());
			pstmt.setLong(61, keystreamin.getPos60());
			pstmt.setLong(62, keystreamin.getPos61());
			pstmt.setLong(63, keystreamin.getPos62());
			pstmt.setLong(64, keystreamin.getPos63());
			pstmt.setLong(65, keystreamin.getPos64());
			pstmt.setLong(66, keystreamin.getPos65());
			pstmt.setLong(67, keystreamin.getPos66());
			pstmt.setLong(68, keystreamin.getPos67());
			pstmt.setLong(69, keystreamin.getPos68());
			pstmt.setLong(70, keystreamin.getPos69());
			pstmt.setLong(71, keystreamin.getPos70());
			pstmt.setLong(72, keystreamin.getPos71());
			pstmt.setLong(73, keystreamin.getPos72());
			pstmt.setLong(74, keystreamin.getPos73());
			pstmt.setLong(75, keystreamin.getPos74());
			pstmt.setLong(76, keystreamin.getPos75());
			pstmt.setLong(77, keystreamin.getPos76());
			pstmt.setLong(78, keystreamin.getPos77());
			pstmt.setLong(79, keystreamin.getPos78());
			pstmt.setLong(80, keystreamin.getPos79());
			pstmt.setLong(81, keystreamin.getPos80());
			pstmt.setLong(82, keystreamin.getPos81());
			pstmt.setLong(83, keystreamin.getPos82());
			pstmt.setLong(84, keystreamin.getPos83());
			pstmt.setLong(85, keystreamin.getPos84());
			pstmt.setLong(86, keystreamin.getPos85());
			pstmt.setLong(87, keystreamin.getPos86());
			pstmt.setLong(88, keystreamin.getPos87());
			pstmt.setLong(89, keystreamin.getPos88());
			pstmt.setLong(90, keystreamin.getPos89());
			pstmt.setLong(91, keystreamin.getPos90());
			pstmt.setLong(92, keystreamin.getPos91());
			pstmt.setLong(93, keystreamin.getPos92());
			pstmt.setLong(94, keystreamin.getPos93());
			pstmt.setLong(95, keystreamin.getPos94());
			pstmt.setLong(96, keystreamin.getPos95());
			pstmt.setLong(97, keystreamin.getPos96());
			pstmt.setLong(98, keystreamin.getPos97());
			pstmt.setLong(99, keystreamin.getPos98());
			pstmt.setLong(100, keystreamin.getPos99());
			pstmt.setLong(101, keystreamin.getPos100());
			pstmt.setLong(102, keystreamin.getPos101());
			pstmt.setLong(103, keystreamin.getPos102());
			pstmt.setLong(104, keystreamin.getPos103());
			pstmt.setLong(105, keystreamin.getPos104());
			pstmt.setLong(106, keystreamin.getPos105());
			pstmt.setLong(107, keystreamin.getPos106());
			pstmt.setLong(108, keystreamin.getPos107());
			pstmt.setLong(109, keystreamin.getPos108());
			pstmt.setLong(110, keystreamin.getPos109());
			pstmt.setLong(111, keystreamin.getPos110());
			pstmt.setLong(112, keystreamin.getPos111());
			pstmt.setLong(113, keystreamin.getPos112());
			pstmt.setLong(114, keystreamin.getPos113());
			pstmt.setLong(115, keystreamin.getPos114());
			pstmt.setLong(116, keystreamin.getPos115());
			pstmt.setLong(117, keystreamin.getPos116());
			pstmt.setLong(118, keystreamin.getPos117());
			pstmt.setLong(119, keystreamin.getPos118());
			pstmt.setLong(120, keystreamin.getPos119());
			pstmt.setLong(121, keystreamin.getPos120());
			pstmt.setLong(122, keystreamin.getPos121());
			pstmt.setLong(123, keystreamin.getPos122());
			pstmt.setLong(124, keystreamin.getPos123());
			pstmt.setLong(125, keystreamin.getPos124());
			pstmt.setLong(126, keystreamin.getPos125());
			pstmt.setLong(127, keystreamin.getPos126());
			pstmt.setLong(128, keystreamin.getPos127());
			
			pstmt.setLong(129, keystreamin.getKeylength());
			pstmt.setLong(130, keystreamin.getTimes());
			pstmt.setString(131, keystreamin.getPlaintext());
			
			pstmt.executeUpdate();	
	 
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.closeAll(con, pstmt, null);
		}
	}

	/**
	 * @param value is the value we want to compare.
	 * @param number is the number of keystream we want to use in the database. It is 1 in default. 
	 * It means that we only find one keystream once.
	 */
	@Override
	public ResultSet findValueDistributation(int value,int id) {
		String sql = "select * from keystream where id = ?";
		ResultSet keystreamout = null;
		
		try {
			con = org.yatian.utils.JdbcUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, id);
		    keystreamout = pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.closeAll(con, pstmt, null);
		}	
		return keystreamout;
	}

	@Override
	public keystream findById(int id) {
	
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
		conn = JdbcUtil.getConnection();
		
		String sql = "SELECT * FROM keystream where id=?";
		
	
		try {
			
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, id);	
			rs = stmt.executeQuery();
			
			keystream tempcontainer = null;
			
			if(rs.next()){
			tempcontainer = new keystream();
			tempcontainer.setId(rs.getInt(1));
			tempcontainer.setPos0(rs.getInt(2));
			tempcontainer.setPos1(rs.getInt(3));
			tempcontainer.setPos2(rs.getInt(4));
			tempcontainer.setPos3(rs.getInt(5));
			tempcontainer.setPos4(rs.getInt(6));
			tempcontainer.setPos5(rs.getInt(7));
			tempcontainer.setPos6(rs.getInt(8));
			tempcontainer.setPos7(rs.getInt(9));
			tempcontainer.setPos8(rs.getInt(10));
			tempcontainer.setPos9(rs.getInt(11));
			tempcontainer.setPos10(rs.getInt(12));
			tempcontainer.setPos11(rs.getInt(13));
			tempcontainer.setPos12(rs.getInt(14));
			tempcontainer.setPos13(rs.getInt(15));
			tempcontainer.setPos14(rs.getInt(16));
			tempcontainer.setPos15(rs.getInt(17));
			tempcontainer.setPos16(rs.getInt(18));
			tempcontainer.setPos17(rs.getInt(19));
			tempcontainer.setPos18(rs.getInt(20));
			tempcontainer.setPos19(rs.getInt(21));
			tempcontainer.setPos20(rs.getInt(22));
			tempcontainer.setPos21(rs.getInt(23));
			tempcontainer.setPos22(rs.getInt(24));
			tempcontainer.setPos23(rs.getInt(25));
			tempcontainer.setPos24(rs.getInt(26));
			tempcontainer.setPos25(rs.getInt(27));
			tempcontainer.setPos26(rs.getInt(28));
			tempcontainer.setPos27(rs.getInt(29));
			tempcontainer.setPos28(rs.getInt(30));
			tempcontainer.setPos29(rs.getInt(31));
			tempcontainer.setPos30(rs.getInt(32));
			tempcontainer.setPos31(rs.getInt(33));
			tempcontainer.setPos32(rs.getInt(34));
			tempcontainer.setPos33(rs.getInt(35));
			tempcontainer.setPos34(rs.getInt(36));
			tempcontainer.setPos35(rs.getInt(37));
			tempcontainer.setPos36(rs.getInt(38));
			tempcontainer.setPos37(rs.getInt(39));
			tempcontainer.setPos38(rs.getInt(40));
			tempcontainer.setPos39(rs.getInt(41));
			tempcontainer.setPos40(rs.getInt(42));
			tempcontainer.setPos41(rs.getInt(43));
			tempcontainer.setPos42(rs.getInt(44));
			tempcontainer.setPos43(rs.getInt(45));
			tempcontainer.setPos44(rs.getInt(46));
			tempcontainer.setPos45(rs.getInt(47));
			tempcontainer.setPos46(rs.getInt(48));
			tempcontainer.setPos47(rs.getInt(49));
			tempcontainer.setPos48(rs.getInt(50));
			tempcontainer.setPos49(rs.getInt(51));
			tempcontainer.setPos50(rs.getInt(52));
			tempcontainer.setPos51(rs.getInt(53));
			tempcontainer.setPos52(rs.getInt(54));
			tempcontainer.setPos53(rs.getInt(55));
			tempcontainer.setPos54(rs.getInt(56));
			tempcontainer.setPos55(rs.getInt(57));
			tempcontainer.setPos56(rs.getInt(58));
			tempcontainer.setPos57(rs.getInt(59));
			tempcontainer.setPos58(rs.getInt(60));
			tempcontainer.setPos59(rs.getInt(61));
			tempcontainer.setPos60(rs.getInt(62));
			tempcontainer.setPos61(rs.getInt(63));
			tempcontainer.setPos62(rs.getInt(64));
			tempcontainer.setPos63(rs.getInt(65));
			tempcontainer.setPos64(rs.getInt(66));
			tempcontainer.setPos65(rs.getInt(67));
			tempcontainer.setPos66(rs.getInt(68));
			tempcontainer.setPos67(rs.getInt(69));
			tempcontainer.setPos68(rs.getInt(70));
			tempcontainer.setPos69(rs.getInt(71));
			tempcontainer.setPos70(rs.getInt(72));
			tempcontainer.setPos71(rs.getInt(73));
			tempcontainer.setPos72(rs.getInt(74));
			tempcontainer.setPos73(rs.getInt(75));
			tempcontainer.setPos74(rs.getInt(76));
			tempcontainer.setPos75(rs.getInt(77));
			tempcontainer.setPos76(rs.getInt(78));
			tempcontainer.setPos77(rs.getInt(79));
			tempcontainer.setPos78(rs.getInt(80));
			tempcontainer.setPos79(rs.getInt(81));
			tempcontainer.setPos80(rs.getInt(82));
			tempcontainer.setPos81(rs.getInt(83));
			tempcontainer.setPos82(rs.getInt(84));
			tempcontainer.setPos83(rs.getInt(85));
			tempcontainer.setPos84(rs.getInt(86));
			tempcontainer.setPos85(rs.getInt(87));
			tempcontainer.setPos86(rs.getInt(88));
			tempcontainer.setPos87(rs.getInt(89));
			tempcontainer.setPos88(rs.getInt(90));
			tempcontainer.setPos89(rs.getInt(91));
			tempcontainer.setPos90(rs.getInt(92));
			tempcontainer.setPos91(rs.getInt(93));
			tempcontainer.setPos92(rs.getInt(94));
			tempcontainer.setPos93(rs.getInt(95));
			tempcontainer.setPos94(rs.getInt(96));
			tempcontainer.setPos95(rs.getInt(97));
			tempcontainer.setPos96(rs.getInt(98));
			tempcontainer.setPos97(rs.getInt(99));
			tempcontainer.setPos98(rs.getInt(100));
			tempcontainer.setPos99(rs.getInt(101));
			tempcontainer.setPos100(rs.getInt(102));
			tempcontainer.setPos101(rs.getInt(103));
			tempcontainer.setPos102(rs.getInt(104));
			tempcontainer.setPos103(rs.getInt(105));
			tempcontainer.setPos104(rs.getInt(106));
			tempcontainer.setPos105(rs.getInt(107));
			tempcontainer.setPos106(rs.getInt(108));
			tempcontainer.setPos107(rs.getInt(109));
			tempcontainer.setPos108(rs.getInt(110));
			tempcontainer.setPos109(rs.getInt(111));
			tempcontainer.setPos110(rs.getInt(112));
			tempcontainer.setPos111(rs.getInt(113));
			tempcontainer.setPos112(rs.getInt(114));
			tempcontainer.setPos113(rs.getInt(115));
			tempcontainer.setPos114(rs.getInt(116));
			tempcontainer.setPos115(rs.getInt(117));
			tempcontainer.setPos116(rs.getInt(118));
			tempcontainer.setPos117(rs.getInt(119));
			tempcontainer.setPos118(rs.getInt(120));
			tempcontainer.setPos119(rs.getInt(121));
			tempcontainer.setPos120(rs.getInt(122));
			tempcontainer.setPos121(rs.getInt(123));
			tempcontainer.setPos122(rs.getInt(124));
			tempcontainer.setPos123(rs.getInt(125));
			tempcontainer.setPos124(rs.getInt(126));
			tempcontainer.setPos125(rs.getInt(127));
			tempcontainer.setPos126(rs.getInt(128));
			tempcontainer.setPos127(rs.getInt(129));
		
			}
			return tempcontainer;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.closeAll(conn, stmt ,rs);
		}
		
		
		
		return null;
	}

}
