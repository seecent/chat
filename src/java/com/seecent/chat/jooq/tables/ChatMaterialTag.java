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
public class ChatMaterialTag extends org.jooq.impl.TableImpl<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord> {

	private static final long serialVersionUID = -564634429;

	/**
	 * The singleton instance of <code>chatdb.chat_material_tag</code>
	 */
	public static final com.seecent.chat.jooq.tables.ChatMaterialTag CHAT_MATERIAL_TAG = new com.seecent.chat.jooq.tables.ChatMaterialTag();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord> getRecordType() {
		return com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord.class;
	}

	/**
	 * The column <code>chatdb.chat_material_tag.material_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord, java.lang.Long> MATERIAL_ID = createField("material_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>chatdb.chat_material_tag.tag_id</code>.
	 */
	public final org.jooq.TableField<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord, java.lang.Long> TAG_ID = createField("tag_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>chatdb.chat_material_tag</code> table reference
	 */
	public ChatMaterialTag() {
		super("chat_material_tag", com.seecent.chat.jooq.Chatdb.CHATDB);
	}

	/**
	 * Create an aliased <code>chatdb.chat_material_tag</code> table reference
	 */
	public ChatMaterialTag(java.lang.String alias) {
		super(alias, com.seecent.chat.jooq.Chatdb.CHATDB, com.seecent.chat.jooq.tables.ChatMaterialTag.CHAT_MATERIAL_TAG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.seecent.chat.jooq.tables.records.ChatMaterialTagRecord, ?>>asList(com.seecent.chat.jooq.Keys.FK3E206E09424A9A0C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.seecent.chat.jooq.tables.ChatMaterialTag as(java.lang.String alias) {
		return new com.seecent.chat.jooq.tables.ChatMaterialTag(alias);
	}
}
