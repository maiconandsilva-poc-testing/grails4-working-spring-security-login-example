

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.djamware.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.djamware.UserRole'
grails.plugin.springsecurity.authority.className = 'com.djamware.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/login/**', filters: 'none'],
	[pattern: '/logout/**', filters: 'none'],
	[pattern: '/zkau/**', filters: 'none'],
	[pattern: '/zkcomet/**', filters: 'none'],
	[pattern: '/static/*',  filters: 'none'],
	[pattern: '/assets/**', filters: 'none'],
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/zkau/**', filters: 'none'],
	[pattern: '/zkcomet/**', filters: 'none'],
	[pattern: '/static/*',  filters: 'none'],
	[pattern: '/**', filters: 'JOINED_FILTERS']
]

grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/product'
