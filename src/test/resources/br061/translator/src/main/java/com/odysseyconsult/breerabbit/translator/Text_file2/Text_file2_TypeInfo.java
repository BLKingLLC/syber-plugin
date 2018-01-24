////////////////////////////////////////////////////////////////////////
//
// Text_file2_typeinfo.java
//
// This file was generated by MapForce 2015sp2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////


package com.odysseyconsult.breerabbit.translator.Text_file2;

import com.altova.typeinfo.*;



public class Text_file2_TypeInfo
{
	// namespaces indices
	public static final int _altova_ni = 0;


	// typeinfo indices
	public static final int _altova_tif = 0 ;
	public static final int _altova_ti_altova_any = _altova_tif ;
	public static final int _altova_ti_altova_string2 = 1 ;
	public static final int _altova_ti_altova_boolean2 = 2 ;
	public static final int _altova_ti_altova_decimal = 3 ;
	public static final int _altova_ti_altova_double2 = 4 ;
	public static final int _altova_ti_altova_duration = 5 ;
	public static final int _altova_ti_altova_time = 6 ;
	public static final int _altova_ti_altova_date = 7 ;
	public static final int _altova_ti_altova_dateTime = 8 ;
	public static final int _altova_ti_altova_integer = 9 ;
	public static final int _altova_ti_altova_hexBinary = 10 ;
	public static final int _altova_ti_altova_anyURI = 11 ;
	public static final int _altova_ti_altova_unnamedType = 12 ;
	public static final int _altova_ti_altova_RowsType = 13 ;
	public static final int _altova_ti_altova_stringType = 14 ;
	public static final int _altova_ti_altova_decimalType = 15 ;
	public static final int _altova_til = 16 ;



	// memberinfo indices

	public static class _altova_mi_altova_any {
		public static final int begin = 0 ;
		public static final int end = _altova_mi_altova_any.begin ;
	};


	public static class _altova_mi_altova_string2 {
		public static final int begin = _altova_mi_altova_any.end ;
		public static final int end = _altova_mi_altova_string2.begin ;
	};


	public static class _altova_mi_altova_boolean2 {
		public static final int begin = _altova_mi_altova_string2.end ;
		public static final int end = _altova_mi_altova_boolean2.begin ;
	};


	public static class _altova_mi_altova_decimal {
		public static final int begin = _altova_mi_altova_boolean2.end ;
		public static final int end = _altova_mi_altova_decimal.begin ;
	};


	public static class _altova_mi_altova_double2 {
		public static final int begin = _altova_mi_altova_decimal.end ;
		public static final int end = _altova_mi_altova_double2.begin ;
	};


	public static class _altova_mi_altova_duration {
		public static final int begin = _altova_mi_altova_double2.end ;
		public static final int end = _altova_mi_altova_duration.begin ;
	};


	public static class _altova_mi_altova_time {
		public static final int begin = _altova_mi_altova_duration.end ;
		public static final int end = _altova_mi_altova_time.begin ;
	};


	public static class _altova_mi_altova_date {
		public static final int begin = _altova_mi_altova_time.end ;
		public static final int end = _altova_mi_altova_date.begin ;
	};


	public static class _altova_mi_altova_dateTime {
		public static final int begin = _altova_mi_altova_date.end ;
		public static final int end = _altova_mi_altova_dateTime.begin ;
	};


	public static class _altova_mi_altova_integer {
		public static final int begin = _altova_mi_altova_dateTime.end ;
		public static final int end = _altova_mi_altova_integer.begin ;
	};


	public static class _altova_mi_altova_hexBinary {
		public static final int begin = _altova_mi_altova_integer.end ;
		public static final int end = _altova_mi_altova_hexBinary.begin ;
	};


	public static class _altova_mi_altova_anyURI {
		public static final int begin = _altova_mi_altova_hexBinary.end ;
		public static final int end = _altova_mi_altova_anyURI.begin ;
	};


	public static class _altova_mi_altova_unnamedType {
		public static final int begin = _altova_mi_altova_anyURI.end ;
		public static final int _Rows = _altova_mi_altova_unnamedType.begin ;
		public static final int end = 1 ;
	};


	public static class _altova_mi_altova_RowsType {
		public static final int begin = _altova_mi_altova_unnamedType.end ;
		public static final int _Card_ID = _altova_mi_altova_RowsType.begin ;
		public static final int _Date2 = 2 ;
		public static final int _Pay_Code__ = 3 ;
		public static final int _Hours = 4 ;
		public static final int end = 5 ;
	};


	public static class _altova_mi_altova_stringType {
		public static final int begin = _altova_mi_altova_RowsType.end ;
		public static final int _unnamed = _altova_mi_altova_stringType.begin ;
		public static final int end = 6 ;
	};


	public static class _altova_mi_altova_decimalType {
		public static final int begin = _altova_mi_altova_stringType.end ;
		public static final int _unnamed = _altova_mi_altova_decimalType.begin ;
		public static final int end = 7 ;
	};

	

	public static class InfoBinder implements InfoBinderInterface
	{
		public NamespaceInfo[] getNamespaces() {return namespaces;}
		public TypeInfo[] getTypes() {return types;}
		public MemberInfo[] getMembers() {return members;}
	}
	
	public static InfoBinderInterface binder = new InfoBinder();

	// Array of all namespaces with pointers to types:
	public static final NamespaceInfo namespaces[] = 
	{
		new NamespaceInfo(binder, "", "", _altova_tif, _altova_til),
	};

	
// Array of all types with pointers to members:
	public static final TypeInfo types[] = new TypeInfoCreator().createTypes(binder);

	private static class TypeInfoCreator
	{
		private void initTypes0(InfoBinderInterface binder, TypeInfo[] types) {
			types[0] = new TypeInfo( binder, _altova_ni, "any", 0, _altova_mi_altova_any.begin, _altova_mi_altova_any.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[1] = new TypeInfo( binder, _altova_ni, "string", _altova_ti_altova_any, _altova_mi_altova_string2.begin, _altova_mi_altova_string2.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.AnySimpleTypeFormatter );
			types[2] = new TypeInfo( binder, _altova_ni, "boolean", _altova_ti_altova_any, _altova_mi_altova_boolean2.begin, _altova_mi_altova_boolean2.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.AnySimpleTypeFormatter );
			types[3] = new TypeInfo( binder, _altova_ni, "decimal", _altova_ti_altova_any, _altova_mi_altova_decimal.begin, _altova_mi_altova_decimal.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.DecimalFormatter );
			types[4] = new TypeInfo( binder, _altova_ni, "double", _altova_ti_altova_any, _altova_mi_altova_double2.begin, _altova_mi_altova_double2.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.DoubleFormatter );
			types[5] = new TypeInfo( binder, _altova_ni, "duration", _altova_ti_altova_any, _altova_mi_altova_duration.begin, _altova_mi_altova_duration.end,  null, 				WhitespaceType.Whitespace_Unknown,  com.altova.text.Xs.DurationFormatter );
			types[6] = new TypeInfo( binder, _altova_ni, "time", _altova_ti_altova_any, _altova_mi_altova_time.begin, _altova_mi_altova_time.end,  null, 				WhitespaceType.Whitespace_Unknown,  com.altova.text.Xs.TimeFormatter );
			types[7] = new TypeInfo( binder, _altova_ni, "date", _altova_ti_altova_any, _altova_mi_altova_date.begin, _altova_mi_altova_date.end,  null, 				WhitespaceType.Whitespace_Unknown,  com.altova.text.Xs.DateFormatter );
			types[8] = new TypeInfo( binder, _altova_ni, "dateTime", _altova_ti_altova_any, _altova_mi_altova_dateTime.begin, _altova_mi_altova_dateTime.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.DateTimeFormatter );
			types[9] = new TypeInfo( binder, _altova_ni, "integer", _altova_ti_altova_any, _altova_mi_altova_integer.begin, _altova_mi_altova_integer.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.IntegerFormatter );
			types[10] = new TypeInfo( binder, _altova_ni, "hexBinary", _altova_ti_altova_any, _altova_mi_altova_hexBinary.begin, _altova_mi_altova_hexBinary.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.HexBinaryFormatter );
			types[11] = new TypeInfo( binder, _altova_ni, "anyURI", _altova_ti_altova_any, _altova_mi_altova_anyURI.begin, _altova_mi_altova_anyURI.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[12] = new TypeInfo( binder, _altova_ni, "", 0, _altova_mi_altova_unnamedType.begin, _altova_mi_altova_unnamedType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[13] = new TypeInfo( binder, _altova_ni, "", 0, _altova_mi_altova_RowsType.begin, _altova_mi_altova_RowsType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[14] = new TypeInfo( binder, _altova_ni, "", 0, _altova_mi_altova_stringType.begin, _altova_mi_altova_stringType.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.AnySimpleTypeFormatter );
			types[15] = new TypeInfo( binder, _altova_ni, "", 0, _altova_mi_altova_decimalType.begin, _altova_mi_altova_decimalType.end,  null, 				WhitespaceType.Whitespace_Unknown, com.altova.text.Xs.DecimalFormatter );

		}

		public TypeInfo[] createTypes(InfoBinderInterface binder) {

			TypeInfo types[] = new TypeInfo[16];

			initTypes0(binder, types);
			
			return types;

		}
	}

	// Array of all members
	public static final MemberInfo members[] = new MemberInfoCreator().createMembers(binder);

	private static class MemberInfoCreator
	{
		private void initMembers0(InfoBinderInterface binder, MemberInfo[] members) {
			members[0] = new MemberInfo (binder, "", "Rows", _altova_ti_altova_unnamedType, _altova_ti_altova_RowsType, 0, 0, -1);

			members[1] = new MemberInfo (binder, "", "Card ID", _altova_ti_altova_RowsType, _altova_ti_altova_stringType, 0, 0, 1);
			members[2] = new MemberInfo (binder, "", "Date", _altova_ti_altova_RowsType, _altova_ti_altova_stringType, 0, 0, 1);
			members[3] = new MemberInfo (binder, "", "Pay Code #", _altova_ti_altova_RowsType, _altova_ti_altova_stringType, 0, 0, 1);
			members[4] = new MemberInfo (binder, "", "Hours", _altova_ti_altova_RowsType, _altova_ti_altova_decimalType, 0, 0, 1);

			members[5] = new MemberInfo (binder, "", "", _altova_ti_altova_stringType, _altova_ti_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);

			members[6] = new MemberInfo (binder, "", "", _altova_ti_altova_decimalType, _altova_ti_altova_decimal, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);

		}

		public MemberInfo[] createMembers(InfoBinderInterface binder) {

			MemberInfo members[] = new MemberInfo[7];

			initMembers0(binder, members);
			
			return members;

		}
	}
}
