/*
* JBoss, a division of Red Hat
* Copyright 2006, Red Hat Middleware, LLC, and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/

package org.picketlink.idm.impl.configuration.metadata;

import org.picketlink.idm.spi.configuration.metadata.IdentityObjectAttributeMetaData;
import org.picketlink.idm.spi.configuration.metadata.IdentityObjectTypeMetaData;
import org.picketlink.idm.spi.configuration.metadata.RelationshipMetaData;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:boleslaw.dawidowicz at redhat.com">Boleslaw Dawidowicz</a>
 * @version : 0.1 $
 */
public class IdentityObjectTypeMetaDataImpl implements IdentityObjectTypeMetaData, Serializable
{

   private String name;

   private List<RelationshipMetaData> relationships;

   private List<IdentityObjectAttributeMetaData> attributes;

   private Map<String, List<String>> options;

   private List<String> credentials;

   public IdentityObjectTypeMetaDataImpl()
   {
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public List<RelationshipMetaData> getRelationships()
   {
      return relationships;
   }

   public void setRelationships(List<RelationshipMetaData> relationships)
   {
      this.relationships = relationships;
   }

   public List<IdentityObjectAttributeMetaData> getAttributes()
   {
      return attributes;
   }

   public void setAttributes(List<IdentityObjectAttributeMetaData> attributes)
   {
      this.attributes = attributes;
   }

   public List<String> getCredentials()
   {
      return credentials;
   }

   public void setCredentials(List<String> credentials)
   {
      this.credentials = credentials;
   }

   public Map<String, List<String>> getOptions()
   {
      return options;
   }

   public void setOptions(Map<String, List<String>> options)
   {
      this.options = options;
   }

   public List<String> getOption(String optionName)
   {
      if (options != null )
      {
         return options.get(optionName);
      }

      return null;
   }

   public String getOptionSingleValue(String optionName)
   {
      List<String> values = getOption(optionName);

      if (values != null && values.size() > 0)
      {
         return values.get(0);
      }

      return null;
   }
}