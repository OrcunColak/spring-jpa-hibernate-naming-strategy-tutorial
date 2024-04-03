# Read me

The original idea is from  
https://webcache.googleusercontent.com/search?q=cache:https://levelup.gitconnected.com/are-you-applying-hibernates-naming-strategies-in-the-right-way-0458601a9101

# persistence.xml example

```xml

<persistence>
    <persistence-unit name="naming">
        ...
        <properties>
            <property name="hibernate.physical_naming_strategy"
                      value="com.hibernate.naming.CustomSuffixPhysicalNamingStrategy"/>
        </properties>
    </persistence-unit>
</persistence>
```

# spring example

```
spring.jpa.hibernate.naming.physical-strategy= com.hibernate.naming.CustomSuffixPhysicalNamingStrategy
```