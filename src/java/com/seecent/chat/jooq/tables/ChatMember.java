/**
 * This class is generated by jOOQ
 */
package com.seecent.chat.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.3" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChatMember extends org.jooq.impl.TableImpl<com.seecent.chat.jooq.tables.records.ChatMemberRecord> {

	private static final long serialVersionUID = 2022985481;

	/**
	 * The singleton instance of <code>chatdb.chat_member</code>
	 */
	public static final com.seecent.chat.jooq.tables.ChatMember CHAT_MEMBER = new com.seecent.chat.jooq.tables.ChatMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.seecent.chat.jooq.tables.records.ChatMemberRecord> getRecordType() {
		return com.seecent.chat.jooq.tables.records.ChatMemberRecord.class;
	}

	/**
	 * The column <code>chatdb.chat_member.id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.version</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.account_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.address</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.age</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.birthday</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.sql.Timestamp> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>chatdb.chat_member.city</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.country</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.date_created</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.sql.Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.email</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.grade_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> GRADE_ID = createField("grade_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.group_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>chatdb.chat_member.headimgurl</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> HEADIMGURL = createField("headimgurl", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.language</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.last_updated</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.sql.Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.location_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>chatdb.chat_member.name</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.nick_name</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.no</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Integer> NO = createField("no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.open_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.phone</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.province</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.qq</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> QQ = createField("qq", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.sex</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Integer> SEX = createField("sex", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.subscribe</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Boolean> SUBSCRIBE = createField("subscribe", org.jooq.impl.SQLDataType.BIT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_member.subscribe_time</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.sql.Timestamp> SUBSCRIBE_TIME = createField("subscribe_time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>chatdb.chat_member.unionid</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> UNIONID = createField("unionid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.weixin</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> WEIXIN = createField("weixin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.description</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>chatdb.chat_member.postcode</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.String> POSTCODE = createField("postcode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>chatdb.chat_member</code> table reference
	 */
	public ChatMember() {
		super("chat_member", com.seecent.chat.jooq.Chatdb.CHATDB);
	}

	/**
	 * Create an aliased <code>chatdb.chat_member</code> table reference
	 */
	public ChatMember(java.lang.String alias) {
		super(alias, com.seecent.chat.jooq.Chatdb.CHATDB, com.seecent.chat.jooq.tables.ChatMember.CHAT_MEMBER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.seecent.chat.jooq.tables.records.ChatMemberRecord, java.lang.Long> getIdentity() {
		return com.seecent.chat.jooq.Keys.IDENTITY_CHAT_MEMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.seecent.chat.jooq.tables.records.ChatMemberRecord> getPrimaryKey() {
		return com.seecent.chat.jooq.Keys.KEY_CHAT_MEMBER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.seecent.chat.jooq.tables.records.ChatMemberRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.seecent.chat.jooq.tables.records.ChatMemberRecord>>asList(com.seecent.chat.jooq.Keys.KEY_CHAT_MEMBER_PRIMARY, com.seecent.chat.jooq.Keys.KEY_CHAT_MEMBER_ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.seecent.chat.jooq.tables.records.ChatMemberRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.seecent.chat.jooq.tables.records.ChatMemberRecord, ?>>asList(com.seecent.chat.jooq.Keys.FK73700161783EC85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.seecent.chat.jooq.tables.ChatMember as(java.lang.String alias) {
		return new com.seecent.chat.jooq.tables.ChatMember(alias);
	}
}