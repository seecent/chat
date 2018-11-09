/**
 * This class is generated by jOOQ
 */
package com.trunksoft.chat.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.3" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChatMaterialTagRecord extends org.jooq.impl.TableRecordImpl<com.trunksoft.chat.jooq.tables.records.ChatMaterialTagRecord> implements org.jooq.Record2<java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 322607881;

	/**
	 * Setter for <code>chatdb.chat_material_tag.material_id</code>.
	 */
	public void setMaterialId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>chatdb.chat_material_tag.material_id</code>.
	 */
	public java.lang.Long getMaterialId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>chatdb.chat_material_tag.tag_id</code>.
	 */
	public void setTagId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>chatdb.chat_material_tag.tag_id</code>.
	 */
	public java.lang.Long getTagId() {
		return (java.lang.Long) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.trunksoft.chat.jooq.tables.ChatMaterialTag.CHAT_MATERIAL_TAG.MATERIAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.trunksoft.chat.jooq.tables.ChatMaterialTag.CHAT_MATERIAL_TAG.TAG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getMaterialId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getTagId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ChatMaterialTagRecord
	 */
	public ChatMaterialTagRecord() {
		super(com.trunksoft.chat.jooq.tables.ChatMaterialTag.CHAT_MATERIAL_TAG);
	}

	/**
	 * Create a detached, initialised ChatMaterialTagRecord
	 */
	public ChatMaterialTagRecord(java.lang.Long materialId, java.lang.Long tagId) {
		super(com.trunksoft.chat.jooq.tables.ChatMaterialTag.CHAT_MATERIAL_TAG);

		setValue(0, materialId);
		setValue(1, tagId);
	}
}
