<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="assicurati">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="assicurato" maxOccurs="unbounded">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="nome" type="xs:string"/>
              <xs:element name="cognome" type="xs:string"/>
              <xs:element name="datadinascita" type="xs:date"/>
              <xs:element name="codicefiscale" type="xs:string"/>
              <xs:element name="numerosinistri" type="xs:integer"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>

</xs:schema>
