/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.DBObject;

/**
 * @author baban_sinha
 *
 */
@Document(collection="fs.files")
public class GridFSDocument implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -678143623155206314L;

	@Id
	public ObjectId id;
	
	@Field
	public String filename;
	
	@Field
	public Date uploadDate;
	
	@Field
	public DBObject metadata;
	
	public GridFSDocument(String filename, Date uploadDate , DBObject metadata)
	{
		this.filename = filename;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public DBObject getMetadata() {
		return metadata;
	}

	public void setMetadata(DBObject metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "GridFSDocument [id=" + id + ", filename=" + filename + ", uploadDate=" + uploadDate + ", metadata="
				+ metadata + "]";
	}
	
}
