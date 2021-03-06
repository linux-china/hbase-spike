/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.generated;  
@SuppressWarnings("all")
public class UserGora extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserGora\",\"namespace\":\"org.apache.gora.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"nick\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"int\",\"default\":0},{\"name\":\"password\",\"type\":[\"null\",\"string\"],\"default\":null}]}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    __G__DIRTY(0, "__g__dirty"),
    NICK(1, "nick"),
    TIMESTAMP(2, "timestamp"),
    EMAIL(3, "email"),
    STATUS(4, "status"),
    PASSWORD(5, "password"),
    ;
    /**
     * Field's index.
     */
    private int index;

    /**
     * Field's name.
     */
    private String name;

    /**
     * Field's constructor
     * @param index field's index.
     * @param name field's name.
     */
    Field(int index, String name) {this.index=index;this.name=name;}

    /**
     * Gets field's index.
     * @return int field's index.
     */
    public int getIndex() {return index;}

    /**
     * Gets field's name.
     * @return String field's name.
     */
    public String getName() {return name;}

    /**
     * Gets field's attributes to string.
     * @return String field's attributes to string.
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
  "__g__dirty",
  "nick",
  "timestamp",
  "email",
  "status",
  "password",
  };

  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[1]);
  private java.lang.CharSequence nick;
  private long timestamp;
  private java.lang.CharSequence email;
  private int status;
  private java.lang.CharSequence password;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return nick;
    case 2: return timestamp;
    case 3: return email;
    case 4: return status;
    case 5: return password;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)(value); break;
    case 1: nick = (java.lang.CharSequence)(value); break;
    case 2: timestamp = (java.lang.Long)(value); break;
    case 3: email = (java.lang.CharSequence)(value); break;
    case 4: status = (java.lang.Integer)(value); break;
    case 5: password = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nick' field.
   */
  public java.lang.CharSequence getNick() {
    return nick;
  }

  /**
   * Sets the value of the 'nick' field.
   * @param value the value to set.
   */
  public void setNick(java.lang.CharSequence value) {
    this.nick = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'nick' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isNickDirty(java.lang.CharSequence value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'timestamp' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isTimestampDirty(java.lang.Long value) {
    return isDirty(2);
  }

  /**
   * Gets the value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
    setDirty(3);
  }
  
  /**
   * Checks the dirty status of the 'email' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isEmailDirty(java.lang.CharSequence value) {
    return isDirty(3);
  }

  /**
   * Gets the value of the 'status' field.
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Integer value) {
    this.status = value;
    setDirty(4);
  }
  
  /**
   * Checks the dirty status of the 'status' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isStatusDirty(java.lang.Integer value) {
    return isDirty(4);
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.CharSequence getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   * @param value the value to set.
   */
  public void setPassword(java.lang.CharSequence value) {
    this.password = value;
    setDirty(5);
  }
  
  /**
   * Checks the dirty status of the 'password' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isPasswordDirty(java.lang.CharSequence value) {
    return isDirty(5);
  }

  /** Creates a new UserGora RecordBuilder */
  public static org.apache.gora.generated.UserGora.Builder newBuilder() {
    return new org.apache.gora.generated.UserGora.Builder();
  }
  
  /** Creates a new UserGora RecordBuilder by copying an existing Builder */
  public static org.apache.gora.generated.UserGora.Builder newBuilder(org.apache.gora.generated.UserGora.Builder other) {
    return new org.apache.gora.generated.UserGora.Builder(other);
  }
  
  /** Creates a new UserGora RecordBuilder by copying an existing UserGora instance */
  public static org.apache.gora.generated.UserGora.Builder newBuilder(org.apache.gora.generated.UserGora other) {
    return new org.apache.gora.generated.UserGora.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToWriteOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for UserGora instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserGora>
    implements org.apache.avro.data.RecordBuilder<UserGora> {

    private java.nio.ByteBuffer __g__dirty;
    private java.lang.CharSequence nick;
    private long timestamp;
    private java.lang.CharSequence email;
    private int status;
    private java.lang.CharSequence password;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.generated.UserGora.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.generated.UserGora.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing UserGora instance */
    private Builder(org.apache.gora.generated.UserGora other) {
            super(org.apache.gora.generated.UserGora.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nick)) {
        this.nick = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.nick);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.status)) {
        this.status = (java.lang.Integer) data().deepCopy(fields()[4].schema(), other.status);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.password)) {
        this.password = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.password);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'nick' field */
    public java.lang.CharSequence getNick() {
      return nick;
    }
    
    /** Sets the value of the 'nick' field */
    public org.apache.gora.generated.UserGora.Builder setNick(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nick = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nick' field has been set */
    public boolean hasNick() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nick' field */
    public org.apache.gora.generated.UserGora.Builder clearNick() {
      nick = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public org.apache.gora.generated.UserGora.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timestamp' field */
    public org.apache.gora.generated.UserGora.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }
    
    /** Gets the value of the 'email' field */
    public java.lang.CharSequence getEmail() {
      return email;
    }
    
    /** Sets the value of the 'email' field */
    public org.apache.gora.generated.UserGora.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.email = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'email' field has been set */
    public boolean hasEmail() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'email' field */
    public org.apache.gora.generated.UserGora.Builder clearEmail() {
      email = null;
      fieldSetFlags()[3] = false;
      return this;
    }
    
    /** Gets the value of the 'status' field */
    public java.lang.Integer getStatus() {
      return status;
    }
    
    /** Sets the value of the 'status' field */
    public org.apache.gora.generated.UserGora.Builder setStatus(int value) {
      validate(fields()[4], value);
      this.status = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'status' field has been set */
    public boolean hasStatus() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'status' field */
    public org.apache.gora.generated.UserGora.Builder clearStatus() {
      fieldSetFlags()[4] = false;
      return this;
    }
    
    /** Gets the value of the 'password' field */
    public java.lang.CharSequence getPassword() {
      return password;
    }
    
    /** Sets the value of the 'password' field */
    public org.apache.gora.generated.UserGora.Builder setPassword(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.password = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'password' field has been set */
    public boolean hasPassword() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'password' field */
    public org.apache.gora.generated.UserGora.Builder clearPassword() {
      password = null;
      fieldSetFlags()[5] = false;
      return this;
    }
    
    @Override
    public UserGora build() {
      try {
        UserGora record = new UserGora();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(new byte[1]);
        record.nick = fieldSetFlags()[1] ? this.nick : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.email = fieldSetFlags()[3] ? this.email : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.status = fieldSetFlags()[4] ? this.status : (java.lang.Integer) defaultValue(fields()[4]);
        record.password = fieldSetFlags()[5] ? this.password : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public UserGora.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public UserGora newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends UserGora implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  				  /**
	   * Gets the value of the 'nick' field.
		   */
	  public java.lang.CharSequence getNick() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'nick' field.
		   * @param value the value to set.
	   */
	  public void setNick(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'nick' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isNickDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'timestamp' field.
		   */
	  public java.lang.Long getTimestamp() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'timestamp' field.
		   * @param value the value to set.
	   */
	  public void setTimestamp(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'timestamp' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isTimestampDirty(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'email' field.
		   */
	  public java.lang.CharSequence getEmail() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'email' field.
		   * @param value the value to set.
	   */
	  public void setEmail(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'email' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isEmailDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'status' field.
		   */
	  public java.lang.Integer getStatus() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'status' field.
		   * @param value the value to set.
	   */
	  public void setStatus(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'status' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isStatusDirty(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'password' field.
		   */
	  public java.lang.CharSequence getPassword() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'password' field.
		   * @param value the value to set.
	   */
	  public void setPassword(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'password' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isPasswordDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}