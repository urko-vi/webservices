/*
 * An XML document type.
 * Localname: saludar
 * Namespace: http://ws.formacion.ipartek.com
 * Java type: com.ipartek.formacion.ws.SaludarDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.ws.impl;
/**
 * A document containing one saludar(@http://ws.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public class SaludarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.ws.SaludarDocument
{
    
    public SaludarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALUDAR$0 = 
        new javax.xml.namespace.QName("http://ws.formacion.ipartek.com", "saludar");
    
    
    /**
     * Gets the "saludar" element
     */
    public com.ipartek.formacion.ws.SaludarDocument.Saludar getSaludar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarDocument.Saludar target = null;
            target = (com.ipartek.formacion.ws.SaludarDocument.Saludar)get_store().find_element_user(SALUDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "saludar" element
     */
    public void setSaludar(com.ipartek.formacion.ws.SaludarDocument.Saludar saludar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarDocument.Saludar target = null;
            target = (com.ipartek.formacion.ws.SaludarDocument.Saludar)get_store().find_element_user(SALUDAR$0, 0);
            if (target == null)
            {
                target = (com.ipartek.formacion.ws.SaludarDocument.Saludar)get_store().add_element_user(SALUDAR$0);
            }
            target.set(saludar);
        }
    }
    
    /**
     * Appends and returns a new empty "saludar" element
     */
    public com.ipartek.formacion.ws.SaludarDocument.Saludar addNewSaludar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarDocument.Saludar target = null;
            target = (com.ipartek.formacion.ws.SaludarDocument.Saludar)get_store().add_element_user(SALUDAR$0);
            return target;
        }
    }
    /**
     * An XML saludar(@http://ws.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public static class SaludarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.ws.SaludarDocument.Saludar
    {
        
        public SaludarImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://ws.formacion.ipartek.com", "args0");
        
        
        /**
         * Gets the "args0" element
         */
        public java.lang.String getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "args0" element
         */
        public org.apache.xmlbeans.XmlString xgetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "args0" element
         */
        public boolean isNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "args0" element
         */
        public boolean isSetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARGS0$0) != 0;
            }
        }
        
        /**
         * Sets the "args0" element
         */
        public void setArgs0(java.lang.String args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGS0$0);
                }
                target.setStringValue(args0);
            }
        }
        
        /**
         * Sets (as xml) the "args0" element
         */
        public void xsetArgs0(org.apache.xmlbeans.XmlString args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.set(args0);
            }
        }
        
        /**
         * Nils the "args0" element
         */
        public void setNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "args0" element
         */
        public void unsetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARGS0$0, 0);
            }
        }
    }
}
