// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server-streaming.proto

// Protobuf Java Version: 3.25.1
package server_streaming;

public final class ServerStreamingOuterClass {
  private ServerStreamingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:server_streaming.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code server_streaming.Message}
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:server_streaming.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      message_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server_streaming.ServerStreamingOuterClass.Message.class, server_streaming.ServerStreamingOuterClass.Message.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof server_streaming.ServerStreamingOuterClass.Message)) {
        return super.equals(obj);
      }
      server_streaming.ServerStreamingOuterClass.Message other = (server_streaming.ServerStreamingOuterClass.Message) obj;

      if (!getMessage()
          .equals(other.getMessage())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static server_streaming.ServerStreamingOuterClass.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static server_streaming.ServerStreamingOuterClass.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static server_streaming.ServerStreamingOuterClass.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(server_streaming.ServerStreamingOuterClass.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code server_streaming.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:server_streaming.Message)
        server_streaming.ServerStreamingOuterClass.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                server_streaming.ServerStreamingOuterClass.Message.class, server_streaming.ServerStreamingOuterClass.Message.Builder.class);
      }

      // Construct using server_streaming.ServerStreamingOuterClass.Message.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        message_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Message_descriptor;
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Message getDefaultInstanceForType() {
        return server_streaming.ServerStreamingOuterClass.Message.getDefaultInstance();
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Message build() {
        server_streaming.ServerStreamingOuterClass.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Message buildPartial() {
        server_streaming.ServerStreamingOuterClass.Message result = new server_streaming.ServerStreamingOuterClass.Message(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(server_streaming.ServerStreamingOuterClass.Message result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.message_ = message_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof server_streaming.ServerStreamingOuterClass.Message) {
          return mergeFrom((server_streaming.ServerStreamingOuterClass.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(server_streaming.ServerStreamingOuterClass.Message other) {
        if (other == server_streaming.ServerStreamingOuterClass.Message.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 1;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        message_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        message_ = getDefaultInstance().getMessage();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        message_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:server_streaming.Message)
    }

    // @@protoc_insertion_point(class_scope:server_streaming.Message)
    private static final server_streaming.ServerStreamingOuterClass.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new server_streaming.ServerStreamingOuterClass.Message();
    }

    public static server_streaming.ServerStreamingOuterClass.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public server_streaming.ServerStreamingOuterClass.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NumberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:server_streaming.Number)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    int getValue();
  }
  /**
   * Protobuf type {@code server_streaming.Number}
   */
  public static final class Number extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:server_streaming.Number)
      NumberOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Number.newBuilder() to construct.
    private Number(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Number() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Number();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Number_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Number_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server_streaming.ServerStreamingOuterClass.Number.class, server_streaming.ServerStreamingOuterClass.Number.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_ = 0;
    /**
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != 0) {
        output.writeInt32(1, value_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, value_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof server_streaming.ServerStreamingOuterClass.Number)) {
        return super.equals(obj);
      }
      server_streaming.ServerStreamingOuterClass.Number other = (server_streaming.ServerStreamingOuterClass.Number) obj;

      if (getValue()
          != other.getValue()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static server_streaming.ServerStreamingOuterClass.Number parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static server_streaming.ServerStreamingOuterClass.Number parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static server_streaming.ServerStreamingOuterClass.Number parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(server_streaming.ServerStreamingOuterClass.Number prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code server_streaming.Number}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:server_streaming.Number)
        server_streaming.ServerStreamingOuterClass.NumberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Number_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Number_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                server_streaming.ServerStreamingOuterClass.Number.class, server_streaming.ServerStreamingOuterClass.Number.Builder.class);
      }

      // Construct using server_streaming.ServerStreamingOuterClass.Number.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        value_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return server_streaming.ServerStreamingOuterClass.internal_static_server_streaming_Number_descriptor;
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Number getDefaultInstanceForType() {
        return server_streaming.ServerStreamingOuterClass.Number.getDefaultInstance();
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Number build() {
        server_streaming.ServerStreamingOuterClass.Number result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public server_streaming.ServerStreamingOuterClass.Number buildPartial() {
        server_streaming.ServerStreamingOuterClass.Number result = new server_streaming.ServerStreamingOuterClass.Number(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(server_streaming.ServerStreamingOuterClass.Number result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.value_ = value_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof server_streaming.ServerStreamingOuterClass.Number) {
          return mergeFrom((server_streaming.ServerStreamingOuterClass.Number)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(server_streaming.ServerStreamingOuterClass.Number other) {
        if (other == server_streaming.ServerStreamingOuterClass.Number.getDefaultInstance()) return this;
        if (other.getValue() != 0) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                value_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int value_ ;
      /**
       * <code>int32 value = 1;</code>
       * @return The value.
       */
      @java.lang.Override
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(int value) {

        value_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:server_streaming.Number)
    }

    // @@protoc_insertion_point(class_scope:server_streaming.Number)
    private static final server_streaming.ServerStreamingOuterClass.Number DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new server_streaming.ServerStreamingOuterClass.Number();
    }

    public static server_streaming.ServerStreamingOuterClass.Number getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Number>
        PARSER = new com.google.protobuf.AbstractParser<Number>() {
      @java.lang.Override
      public Number parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Number> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Number> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public server_streaming.ServerStreamingOuterClass.Number getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_server_streaming_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_server_streaming_Message_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_server_streaming_Number_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_server_streaming_Number_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026server-streaming.proto\022\020server_streami" +
      "ng\"\032\n\007Message\022\017\n\007message\030\001 \001(\t\"\027\n\006Number" +
      "\022\r\n\005value\030\001 \001(\0052_\n\017ServerStreaming\022L\n\021Ge" +
      "tServerResponse\022\030.server_streaming.Numbe" +
      "r\032\031.server_streaming.Message\"\0000\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_server_streaming_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_server_streaming_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_server_streaming_Message_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_server_streaming_Number_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_server_streaming_Number_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_server_streaming_Number_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}